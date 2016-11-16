#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from libcpp.memory cimport shared_ptr, make_shared, unique_ptr, make_unique
from libcpp.string cimport string
from libcpp cimport bool as cbool
from cpython cimport bool as pbool
from libc.stdint cimport int8_t, int16_t, int32_t, int64_t
from cython.operator cimport dereference as deref
from thrift.lib.py3.thrift_server cimport TException

from collections.abc import Sequence, Set, Mapping
from enum import Enum
from py3 cimport includes_types



cdef class Included:
    def __init__(
        self,
        int MyIntField
    ):
        self.c_Included = make_shared[cIncluded]()
        deref(self.c_Included).MyIntField = MyIntField
        
    @staticmethod
    cdef create(shared_ptr[cIncluded] c_Included):
        inst = <Included>Included.__new__(Included)
        inst.c_Included = c_Included
        return inst

    @property
    def MyIntField(self):
        return self.c_Included.get().MyIntField





