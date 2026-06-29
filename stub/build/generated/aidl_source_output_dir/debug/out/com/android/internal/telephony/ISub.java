/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: C:\Users\ANNO\AppData\Local\Android\Sdk\build-tools\35.0.0\aidl.exe -pC:\Users\ANNO\AppData\Local\Android\Sdk\platforms\android-36\framework.aidl -oD:\!tmp\Nitro_IMS\stub\build\generated\aidl_source_output_dir\debug\out -ID:\!tmp\Nitro_IMS\stub\src\main\aidl -ID:\!tmp\Nitro_IMS\stub\src\debug\aidl -dC:\Users\ANNO\AppData\Local\Temp\aidl9049371685044483084.d D:\!tmp\Nitro_IMS\stub\src\main\aidl\com\android\internal\telephony\ISub.aidl
 */
package com.android.internal.telephony;
public interface ISub extends android.os.IInterface
{
  /** Default implementation for ISub. */
  public static class Default implements com.android.internal.telephony.ISub
  {
    @Override public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String callingPackage, java.lang.String callingFeatureId, boolean isForAllProfiles) throws android.os.RemoteException
    {
      return null;
    }
    @Override public int getSlotIndex(int subId) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ISub
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.android.internal.telephony.ISub interface,
     * generating a proxy if needed.
     */
    public static com.android.internal.telephony.ISub asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ISub))) {
        return ((com.android.internal.telephony.ISub)iin);
      }
      return new com.android.internal.telephony.ISub.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_getActiveSubscriptionInfoList:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          java.util.List<android.telephony.SubscriptionInfo> _result = this.getActiveSubscriptionInfoList(_arg0, _arg1, _arg2);
          reply.writeNoException();
          _Parcel.writeTypedList(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getSlotIndex:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getSlotIndex(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.android.internal.telephony.ISub
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String callingPackage, java.lang.String callingFeatureId, boolean isForAllProfiles) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.telephony.SubscriptionInfo> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(callingPackage);
          _data.writeString(callingFeatureId);
          _data.writeInt(((isForAllProfiles)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getActiveSubscriptionInfoList, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getSlotIndex(int subId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(subId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSlotIndex, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    /** @hide */
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ISub";
    static final int TRANSACTION_getActiveSubscriptionInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getSlotIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList(java.lang.String callingPackage, java.lang.String callingFeatureId, boolean isForAllProfiles) throws android.os.RemoteException;
  public int getSlotIndex(int subId) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedList(
        android.os.Parcel parcel, java.util.List<T> value, int parcelableFlags) {
      if (value == null) {
        parcel.writeInt(-1);
      } else {
        int N = value.size();
        int i = 0;
        parcel.writeInt(N);
        while (i < N) {
    writeTypedObject(parcel, value.get(i), parcelableFlags);
          i++;
        }
      }
    }
  }
}
