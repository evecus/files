package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u23 extends Binder implements hw1 {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public u23(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, hw1.b);
    }

    public final int b(gw1 gw1Var, String str) {
        gw1Var.getClass();
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.K) {
            try {
                int i2 = multiInstanceInvalidationService.I + 1;
                multiInstanceInvalidationService.I = i2;
                if (multiInstanceInvalidationService.K.register(gw1Var, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.J.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.I--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final void c(gw1 gw1Var, int i) {
        gw1Var.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.K) {
            multiInstanceInvalidationService.K.unregister(gw1Var);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        v23 v23Var;
        String str = hw1.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        gw1 gw1Var = null;
        gw1 gw1Var2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(gw1.a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof gw1)) {
                    fw1 fw1Var = new fw1();
                    fw1Var.d = readStrongBinder;
                    gw1Var = fw1Var;
                } else {
                    gw1Var = (gw1) queryLocalInterface;
                }
            }
            int b = b(gw1Var, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(b);
            return true;
        }
        if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(gw1.a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof gw1)) {
                    fw1 fw1Var2 = new fw1();
                    fw1Var2.d = readStrongBinder2;
                    gw1Var2 = fw1Var2;
                } else {
                    gw1Var2 = (gw1) queryLocalInterface2;
                }
            }
            c(gw1Var2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int readInt = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.K) {
            String str2 = (String) multiInstanceInvalidationService.J.get(Integer.valueOf(readInt));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = multiInstanceInvalidationService.K.beginBroadcast();
                int i3 = 0;
                while (true) {
                    v23Var = multiInstanceInvalidationService.K;
                    if (i3 >= beginBroadcast) {
                        break;
                    }
                    try {
                        Object broadcastCookie = v23Var.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService.J.get(num);
                        if (readInt != intValue && str2.equals(str3)) {
                            try {
                                ((gw1) multiInstanceInvalidationService.K.getBroadcastItem(i3)).a(createStringArray);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i3++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.K.finishBroadcast();
                        throw th;
                    }
                }
                v23Var.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
