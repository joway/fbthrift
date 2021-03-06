/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include "thrift/compiler/test/fixtures/no_metadata/gen-cpp2/module_data.h"

#include <thrift/lib/cpp2/gen/module_data_cpp.h>

namespace apache {
namespace thrift {


constexpr const std::size_t TEnumDataStorage<::cpp2::MyEnum>::size;
constexpr const std::array<::cpp2::MyEnum, 2> TEnumDataStorage<::cpp2::MyEnum>::values;
constexpr const std::array<folly::StringPiece, 2> TEnumDataStorage<::cpp2::MyEnum>::names;


constexpr const std::size_t TEnumDataStorage<::cpp2::MyUnion::Type>::size;
constexpr const std::array<::cpp2::MyUnion::Type, 3> TEnumDataStorage<::cpp2::MyUnion::Type>::values;
constexpr const std::array<folly::StringPiece, 3> TEnumDataStorage<::cpp2::MyUnion::Type>::names;


constexpr const std::size_t TStructDataStorage<::cpp2::MyDataItem>::fields_size;
constexpr const std::array<folly::StringPiece, TStructDataStorage<::cpp2::MyDataItem>::fields_size> TStructDataStorage<::cpp2::MyDataItem>::fields_names;
constexpr const std::array<int16_t, TStructDataStorage<::cpp2::MyDataItem>::fields_size> TStructDataStorage<::cpp2::MyDataItem>::fields_ids;
constexpr const std::array<apache::thrift::protocol::TType, TStructDataStorage<::cpp2::MyDataItem>::fields_size> TStructDataStorage<::cpp2::MyDataItem>::fields_types;
constexpr const std::size_t TStructDataStorage<::cpp2::MyStruct>::fields_size;
constexpr const std::array<folly::StringPiece, TStructDataStorage<::cpp2::MyStruct>::fields_size> TStructDataStorage<::cpp2::MyStruct>::fields_names;
constexpr const std::array<int16_t, TStructDataStorage<::cpp2::MyStruct>::fields_size> TStructDataStorage<::cpp2::MyStruct>::fields_ids;
constexpr const std::array<apache::thrift::protocol::TType, TStructDataStorage<::cpp2::MyStruct>::fields_size> TStructDataStorage<::cpp2::MyStruct>::fields_types;
constexpr const std::size_t TStructDataStorage<::cpp2::MyUnion>::fields_size;
constexpr const std::array<folly::StringPiece, TStructDataStorage<::cpp2::MyUnion>::fields_size> TStructDataStorage<::cpp2::MyUnion>::fields_names;
constexpr const std::array<int16_t, TStructDataStorage<::cpp2::MyUnion>::fields_size> TStructDataStorage<::cpp2::MyUnion>::fields_ids;
constexpr const std::array<apache::thrift::protocol::TType, TStructDataStorage<::cpp2::MyUnion>::fields_size> TStructDataStorage<::cpp2::MyUnion>::fields_types;

} // namespace thrift
} // namespace apache
