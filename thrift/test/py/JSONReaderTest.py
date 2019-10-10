#
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements. See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership. The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License. You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied. See the License for the
# specific language governing permissions and limitations
# under the License.
#

from __future__ import absolute_import
from __future__ import division
from __future__ import print_function
from __future__ import unicode_literals
import unittest

from JsonReaderTest.ttypes import StructContainingOptionalList
from JsonReaderTest.ttypes import StructContainingRequiredList
from JsonReaderTest.ttypes import StructContainingEnum
from thrift.protocol.TProtocol import TProtocolException


class TestJSONReader(unittest.TestCase):

    def testReadNullOptionalList(self):
        struct = StructContainingOptionalList()
        struct.readFromJson('{ "data" : null }')

    def testReadNullRequiredList(self):
        try:
            struct = StructContainingRequiredList()
            struct.readFromJson('{ "data" : null }')
            self.assertFalse(True,
                    "Should have failed with required field missing")
        except TProtocolException:
            pass

    def testUnrecognizedKwargs(self):
        with self.assertRaises(ValueError) as ex:
            struct = StructContainingRequiredList()
            struct.readFromJson('{ "data" : null }', bad_kwarg=True)

        self.assertIn("bad_kwarg", str(ex.exception))

    def testUnrecognizedEnum(self):
        with self.assertRaises(TProtocolException) as ex:
            struct = StructContainingEnum()
            struct.readFromJson('{ "data": 100}')

        self.assertIn(
            "100 is not a recognized value of enum type EnumZeroToTen",
            str(ex.exception),
        )

    def testUnrecognizedEnumRelaxedValidation(self):
        struct = StructContainingEnum()
        struct.readFromJson('{ "data": 100}', relax_enum_validation=True)


if __name__ == '__main__':
    unittest.main()
