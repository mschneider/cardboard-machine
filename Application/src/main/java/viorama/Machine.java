// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: machine.proto

package viorama;

public final class Machine {
  private Machine() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GyroFrameOrBuilder extends
      // @@protoc_insertion_point(interface_extends:viorama.GyroFrame)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string uuid = 1;</code>
     *
     * <pre>
     * persistent user data
     * </pre>
     */
    boolean hasUuid();
    /**
     * <code>required string uuid = 1;</code>
     *
     * <pre>
     * persistent user data
     * </pre>
     */
    java.lang.String getUuid();
    /**
     * <code>required string uuid = 1;</code>
     *
     * <pre>
     * persistent user data
     * </pre>
     */
    com.google.protobuf.ByteString
        getUuidBytes();

    /**
     * <code>required float time = 2;</code>
     */
    boolean hasTime();
    /**
     * <code>required float time = 2;</code>
     */
    float getTime();

    /**
     * <code>required .viorama.Vec3f rotation = 3;</code>
     */
    boolean hasRotation();
    /**
     * <code>required .viorama.Vec3f rotation = 3;</code>
     */
    viorama.Geometry.Vec3f getRotation();
    /**
     * <code>required .viorama.Vec3f rotation = 3;</code>
     */
    viorama.Geometry.Vec3fOrBuilder getRotationOrBuilder();
  }
  /**
   * Protobuf type {@code viorama.GyroFrame}
   *
   * <pre>
   * tell ProtoBuf (c#) to act as the reference implementation
   *:preserveunknown
   * </pre>
   */
  public static final class GyroFrame extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:viorama.GyroFrame)
      GyroFrameOrBuilder {
    // Use GyroFrame.newBuilder() to construct.
    private GyroFrame(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GyroFrame(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GyroFrame defaultInstance;
    public static GyroFrame getDefaultInstance() {
      return defaultInstance;
    }

    public GyroFrame getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GyroFrame(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              uuid_ = bs;
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              time_ = input.readFloat();
              break;
            }
            case 26: {
              viorama.Geometry.Vec3f.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = rotation_.toBuilder();
              }
              rotation_ = input.readMessage(viorama.Geometry.Vec3f.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rotation_);
                rotation_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return viorama.Machine.internal_static_viorama_GyroFrame_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return viorama.Machine.internal_static_viorama_GyroFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              viorama.Machine.GyroFrame.class, viorama.Machine.GyroFrame.Builder.class);
    }

    public static com.google.protobuf.Parser<GyroFrame> PARSER =
        new com.google.protobuf.AbstractParser<GyroFrame>() {
      public GyroFrame parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GyroFrame(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GyroFrame> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int UUID_FIELD_NUMBER = 1;
    private java.lang.Object uuid_;
    /**
     * <code>required string uuid = 1;</code>
     *
     * <pre>
     * persistent user data
     * </pre>
     */
    public boolean hasUuid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string uuid = 1;</code>
     *
     * <pre>
     * persistent user data
     * </pre>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uuid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string uuid = 1;</code>
     *
     * <pre>
     * persistent user data
     * </pre>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_FIELD_NUMBER = 2;
    private float time_;
    /**
     * <code>required float time = 2;</code>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required float time = 2;</code>
     */
    public float getTime() {
      return time_;
    }

    public static final int ROTATION_FIELD_NUMBER = 3;
    private viorama.Geometry.Vec3f rotation_;
    /**
     * <code>required .viorama.Vec3f rotation = 3;</code>
     */
    public boolean hasRotation() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .viorama.Vec3f rotation = 3;</code>
     */
    public viorama.Geometry.Vec3f getRotation() {
      return rotation_;
    }
    /**
     * <code>required .viorama.Vec3f rotation = 3;</code>
     */
    public viorama.Geometry.Vec3fOrBuilder getRotationOrBuilder() {
      return rotation_;
    }

    private void initFields() {
      uuid_ = "";
      time_ = 0F;
      rotation_ = viorama.Geometry.Vec3f.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUuid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRotation()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRotation().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUuidBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, time_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, rotation_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getUuidBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, time_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, rotation_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static viorama.Machine.GyroFrame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static viorama.Machine.GyroFrame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static viorama.Machine.GyroFrame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static viorama.Machine.GyroFrame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static viorama.Machine.GyroFrame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static viorama.Machine.GyroFrame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static viorama.Machine.GyroFrame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static viorama.Machine.GyroFrame parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static viorama.Machine.GyroFrame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static viorama.Machine.GyroFrame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(viorama.Machine.GyroFrame prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code viorama.GyroFrame}
     *
     * <pre>
     * tell ProtoBuf (c#) to act as the reference implementation
     *:preserveunknown
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:viorama.GyroFrame)
        viorama.Machine.GyroFrameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return viorama.Machine.internal_static_viorama_GyroFrame_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return viorama.Machine.internal_static_viorama_GyroFrame_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                viorama.Machine.GyroFrame.class, viorama.Machine.GyroFrame.Builder.class);
      }

      // Construct using viorama.Machine.GyroFrame.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRotationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        uuid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (rotationBuilder_ == null) {
          rotation_ = viorama.Geometry.Vec3f.getDefaultInstance();
        } else {
          rotationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return viorama.Machine.internal_static_viorama_GyroFrame_descriptor;
      }

      public viorama.Machine.GyroFrame getDefaultInstanceForType() {
        return viorama.Machine.GyroFrame.getDefaultInstance();
      }

      public viorama.Machine.GyroFrame build() {
        viorama.Machine.GyroFrame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public viorama.Machine.GyroFrame buildPartial() {
        viorama.Machine.GyroFrame result = new viorama.Machine.GyroFrame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uuid_ = uuid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.time_ = time_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (rotationBuilder_ == null) {
          result.rotation_ = rotation_;
        } else {
          result.rotation_ = rotationBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof viorama.Machine.GyroFrame) {
          return mergeFrom((viorama.Machine.GyroFrame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(viorama.Machine.GyroFrame other) {
        if (other == viorama.Machine.GyroFrame.getDefaultInstance()) return this;
        if (other.hasUuid()) {
          bitField0_ |= 0x00000001;
          uuid_ = other.uuid_;
          onChanged();
        }
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        if (other.hasRotation()) {
          mergeRotation(other.getRotation());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUuid()) {
          
          return false;
        }
        if (!hasTime()) {
          
          return false;
        }
        if (!hasRotation()) {
          
          return false;
        }
        if (!getRotation().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        viorama.Machine.GyroFrame parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (viorama.Machine.GyroFrame) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object uuid_ = "";
      /**
       * <code>required string uuid = 1;</code>
       *
       * <pre>
       * persistent user data
       * </pre>
       */
      public boolean hasUuid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string uuid = 1;</code>
       *
       * <pre>
       * persistent user data
       * </pre>
       */
      public java.lang.String getUuid() {
        java.lang.Object ref = uuid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uuid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string uuid = 1;</code>
       *
       * <pre>
       * persistent user data
       * </pre>
       */
      public com.google.protobuf.ByteString
          getUuidBytes() {
        java.lang.Object ref = uuid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          uuid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string uuid = 1;</code>
       *
       * <pre>
       * persistent user data
       * </pre>
       */
      public Builder setUuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        uuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string uuid = 1;</code>
       *
       * <pre>
       * persistent user data
       * </pre>
       */
      public Builder clearUuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uuid_ = getDefaultInstance().getUuid();
        onChanged();
        return this;
      }
      /**
       * <code>required string uuid = 1;</code>
       *
       * <pre>
       * persistent user data
       * </pre>
       */
      public Builder setUuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        uuid_ = value;
        onChanged();
        return this;
      }

      private float time_ ;
      /**
       * <code>required float time = 2;</code>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required float time = 2;</code>
       */
      public float getTime() {
        return time_;
      }
      /**
       * <code>required float time = 2;</code>
       */
      public Builder setTime(float value) {
        bitField0_ |= 0x00000002;
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float time = 2;</code>
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        time_ = 0F;
        onChanged();
        return this;
      }

      private viorama.Geometry.Vec3f rotation_ = viorama.Geometry.Vec3f.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          viorama.Geometry.Vec3f, viorama.Geometry.Vec3f.Builder, viorama.Geometry.Vec3fOrBuilder> rotationBuilder_;
      /**
       * <code>required .viorama.Vec3f rotation = 3;</code>
       */
      public boolean hasRotation() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .viorama.Vec3f rotation = 3;</code>
       */
      public viorama.Geometry.Vec3f getRotation() {
        if (rotationBuilder_ == null) {
          return rotation_;
        } else {
          return rotationBuilder_.getMessage();
        }
      }
      /**
       * <code>required .viorama.Vec3f rotation = 3;</code>
       */
      public Builder setRotation(viorama.Geometry.Vec3f value) {
        if (rotationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rotation_ = value;
          onChanged();
        } else {
          rotationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .viorama.Vec3f rotation = 3;</code>
       */
      public Builder setRotation(
          viorama.Geometry.Vec3f.Builder builderForValue) {
        if (rotationBuilder_ == null) {
          rotation_ = builderForValue.build();
          onChanged();
        } else {
          rotationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .viorama.Vec3f rotation = 3;</code>
       */
      public Builder mergeRotation(viorama.Geometry.Vec3f value) {
        if (rotationBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              rotation_ != viorama.Geometry.Vec3f.getDefaultInstance()) {
            rotation_ =
              viorama.Geometry.Vec3f.newBuilder(rotation_).mergeFrom(value).buildPartial();
          } else {
            rotation_ = value;
          }
          onChanged();
        } else {
          rotationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .viorama.Vec3f rotation = 3;</code>
       */
      public Builder clearRotation() {
        if (rotationBuilder_ == null) {
          rotation_ = viorama.Geometry.Vec3f.getDefaultInstance();
          onChanged();
        } else {
          rotationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>required .viorama.Vec3f rotation = 3;</code>
       */
      public viorama.Geometry.Vec3f.Builder getRotationBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getRotationFieldBuilder().getBuilder();
      }
      /**
       * <code>required .viorama.Vec3f rotation = 3;</code>
       */
      public viorama.Geometry.Vec3fOrBuilder getRotationOrBuilder() {
        if (rotationBuilder_ != null) {
          return rotationBuilder_.getMessageOrBuilder();
        } else {
          return rotation_;
        }
      }
      /**
       * <code>required .viorama.Vec3f rotation = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          viorama.Geometry.Vec3f, viorama.Geometry.Vec3f.Builder, viorama.Geometry.Vec3fOrBuilder> 
          getRotationFieldBuilder() {
        if (rotationBuilder_ == null) {
          rotationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              viorama.Geometry.Vec3f, viorama.Geometry.Vec3f.Builder, viorama.Geometry.Vec3fOrBuilder>(
                  getRotation(),
                  getParentForChildren(),
                  isClean());
          rotation_ = null;
        }
        return rotationBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:viorama.GyroFrame)
    }

    static {
      defaultInstance = new GyroFrame(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:viorama.GyroFrame)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_viorama_GyroFrame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_viorama_GyroFrame_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmachine.proto\022\007viorama\032\016geometry.proto" +
      "\"I\n\tGyroFrame\022\014\n\004uuid\030\001 \002(\t\022\014\n\004time\030\002 \002(" +
      "\002\022 \n\010rotation\030\003 \002(\0132\016.viorama.Vec3fB\002H\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          viorama.Geometry.getDescriptor(),
        }, assigner);
    internal_static_viorama_GyroFrame_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_viorama_GyroFrame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_viorama_GyroFrame_descriptor,
        new java.lang.String[] { "Uuid", "Time", "Rotation", });
    viorama.Geometry.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
