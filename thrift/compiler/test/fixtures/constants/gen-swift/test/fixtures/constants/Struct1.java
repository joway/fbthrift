/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.constants;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.meta_data.FieldValueMetaData;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@ThriftStruct(value="struct1", builder=Struct1.Builder.class)
public final class Struct1 {
    private BitSet __isset_bit_vector = new BitSet();

    @ThriftConstructor
    public Struct1(
        @ThriftField(value=1, name="a", requiredness=Requiredness.NONE) final int a,
        @ThriftField(value=2, name="b", requiredness=Requiredness.NONE) final String b
    ) {
        this.a = a;
        this.b = b;
    }
    
    @ThriftConstructor
    protected Struct1() {
      this.a = 0;
      this.b = null;
    }
    
    public static class Builder {
        private final BitSet __optional_isset = new BitSet();
    
        private int a = 1234567;
        private String b = "<uninitialized>";
    
        @ThriftField(value=1, name="a", requiredness=Requiredness.NONE)
        public Builder setA(int a) {
            this.a = a;
            return this;
        }
    
        public int getA() { return a; }
    
            @ThriftField(value=2, name="b", requiredness=Requiredness.NONE)
        public Builder setB(String b) {
            this.b = b;
            return this;
        }
    
        public String getB() { return b; }
    
        public Builder() { }
        public Builder(Struct1 other) {
            this.a = other.a;
            this.b = other.b;
        }
    
        @ThriftConstructor
        public Struct1 build() {
            Struct1 result = new Struct1 (
                this.a,
                this.b
            );
            result.__isset_bit_vector.or(__optional_isset);
            return result;
        }
    }
    
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("struct1");
    private final int a;
    public static final int _A = 1;
    private static final TField A_FIELD_DESC = new TField("a", TType.I32, (short)1);
        private final String b;
    public static final int _B = 2;
    private static final TField B_FIELD_DESC = new TField("b", TType.STRING, (short)2);
    static {
      NAMES_TO_IDS.put("a", 1);
      FIELD_METADATA.put(1, A_FIELD_DESC);
      NAMES_TO_IDS.put("b", 2);
      FIELD_METADATA.put(2, B_FIELD_DESC);
    }
    
    @ThriftField(value=1, name="a", requiredness=Requiredness.NONE)
    public int getA() { return a; }
        
    /** don't use this method for new code, it's here to make migrating to swift easier */
    @Deprecated
    public boolean fieldIsSetA() {
        return __isset_bit_vector.get(_A);
    }
    
    
    @ThriftField(value=2, name="b", requiredness=Requiredness.NONE)
    public String getB() { return b; }
        
    /** don't use this method for new code, it's here to make migrating to swift easier */
    @Deprecated
    public boolean fieldIsSetB() {
        return this.b != null;
    }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("a", a);
        helper.add("b", b);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        Struct1 other = (Struct1)o;
    
        return
            Objects.equals(a, other.a) &&
            Objects.equals(b, other.b) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            a,
            b
        });
    }
    
    
    public static Struct1 read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(Struct1.NAMES_TO_IDS, Struct1.FIELD_METADATA);
      Struct1.Builder builder = new Struct1.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _A:
          if (__field.type == TType.I32) {
            int a = oprot.readI32();
            builder.setA(a);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _B:
          if (__field.type == TType.STRING) {
            String b = oprot.readString();
            builder.setB(b);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(A_FIELD_DESC);
      oprot.writeI32(this.a);
      oprot.writeFieldEnd();
      if (this.b != null) {
        oprot.writeFieldBegin(B_FIELD_DESC);
        oprot.writeString(this.b);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
}
