/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: C:\Users\ANNO\AppData\Local\Android\Sdk\build-tools\35.0.0\aidl.exe -pC:\Users\ANNO\AppData\Local\Android\Sdk\platforms\android-36\framework.aidl -oD:\!tmp\Nitro_IMS\stub\build\generated\aidl_source_output_dir\debug\out -ID:\!tmp\Nitro_IMS\stub\src\main\aidl -ID:\!tmp\Nitro_IMS\stub\src\debug\aidl -dC:\Users\ANNO\AppData\Local\Temp\aidl10986736576467329512.d D:\!tmp\Nitro_IMS\stub\src\main\aidl\android\app\IInstrumentationWatcher.aidl
 */
package android.app;
public interface IInstrumentationWatcher extends android.os.IInterface
{
  /** Default implementation for IInstrumentationWatcher. */
  public static class Default implements android.app.IInstrumentationWatcher
  {
    @Override public void instrumentationStatus(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException
    {
    }
    @Override public void instrumentationFinished(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.app.IInstrumentationWatcher
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.app.IInstrumentationWatcher interface,
     * generating a proxy if needed.
     */
    public static android.app.IInstrumentationWatcher asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.app.IInstrumentationWatcher))) {
        return ((android.app.IInstrumentationWatcher)iin);
      }
      return new android.app.IInstrumentationWatcher.Stub.Proxy(obj);
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
        case TRANSACTION_instrumentationStatus:
        {
          android.content.ComponentName _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.content.ComponentName.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          _arg2 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.instrumentationStatus(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_instrumentationFinished:
        {
          android.content.ComponentName _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.content.ComponentName.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          _arg2 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.instrumentationFinished(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.app.IInstrumentationWatcher
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
      @Override public void instrumentationStatus(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, name, 0);
          _data.writeInt(resultCode);
          _Parcel.writeTypedObject(_data, results, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_instrumentationStatus, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void instrumentationFinished(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, name, 0);
          _data.writeInt(resultCode);
          _Parcel.writeTypedObject(_data, results, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_instrumentationFinished, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    /** @hide */
    public static final java.lang.String DESCRIPTOR = "android.app.IInstrumentationWatcher";
    static final int TRANSACTION_instrumentationStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_instrumentationFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public void instrumentationStatus(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException;
  public void instrumentationFinished(android.content.ComponentName name, int resultCode, android.os.Bundle results) throws android.os.RemoteException;
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
  }
}
