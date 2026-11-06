package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qc3 implements Handler.Callback, ServiceConnection {
    public final Context I;
    public final Handler J;
    public final HashMap K = new HashMap();
    public HashSet L = new HashSet();

    public qc3(Context context) {
        this.I = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.J = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(pc3 pc3Var) {
        boolean z;
        ArrayDeque arrayDeque = pc3Var.d;
        ComponentName componentName = pc3Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (pc3Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.I;
            boolean bindService = context.bindService(component, this, 33);
            pc3Var.b = bindService;
            if (bindService) {
                pc3Var.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = pc3Var.b;
        }
        if (!z || pc3Var.c == null) {
            b(pc3Var);
            return;
        }
        while (true) {
            nc3 nc3Var = (nc3) arrayDeque.peek();
            if (nc3Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + nc3Var);
                }
                nc3Var.a(pc3Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(pc3Var);
    }

    public final void b(pc3 pc3Var) {
        ComponentName componentName = pc3Var.a;
        ArrayDeque arrayDeque = pc3Var.d;
        Handler handler = this.J;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = pc3Var.e;
        int i2 = i + 1;
        pc3Var.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + pc3Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        kw1 kw1Var = null;
        if (i == 0) {
            nc3 nc3Var = (nc3) message.obj;
            String string = Settings.Secure.getString(this.I.getContentResolver(), "enabled_notification_listeners");
            synchronized (rc3.c) {
                if (string != null) {
                    try {
                        if (!string.equals(rc3.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            rc3.e = hashSet2;
                            rc3.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = rc3.e;
            }
            if (!hashSet.equals(this.L)) {
                this.L = hashSet;
                List<ResolveInfo> queryIntentServices = this.I.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.K.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.K.put(componentName2, new pc3(componentName2));
                    }
                }
                Iterator it2 = this.K.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        pc3 pc3Var = (pc3) entry.getValue();
                        if (pc3Var.b) {
                            this.I.unbindService(this);
                            pc3Var.b = false;
                        }
                        pc3Var.c = null;
                        it2.remove();
                    }
                }
            }
            for (pc3 pc3Var2 : this.K.values()) {
                pc3Var2.d.add(nc3Var);
                a(pc3Var2);
            }
        } else if (i == 1) {
            oc3 oc3Var = (oc3) message.obj;
            ComponentName componentName3 = oc3Var.a;
            IBinder iBinder = oc3Var.b;
            pc3 pc3Var3 = (pc3) this.K.get(componentName3);
            if (pc3Var3 != null) {
                int i2 = jw1.d;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(kw1.c);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof kw1)) {
                        iw1 iw1Var = new iw1();
                        iw1Var.d = iBinder;
                        kw1Var = iw1Var;
                    } else {
                        kw1Var = (kw1) queryLocalInterface;
                    }
                }
                pc3Var3.c = kw1Var;
                pc3Var3.e = 0;
                a(pc3Var3);
                return true;
            }
        } else if (i == 2) {
            pc3 pc3Var4 = (pc3) this.K.get((ComponentName) message.obj);
            if (pc3Var4 != null) {
                if (pc3Var4.b) {
                    this.I.unbindService(this);
                    pc3Var4.b = false;
                }
                pc3Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            pc3 pc3Var5 = (pc3) this.K.get((ComponentName) message.obj);
            if (pc3Var5 != null) {
                a(pc3Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.J.obtainMessage(1, new oc3(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.J.obtainMessage(2, componentName).sendToTarget();
    }
}
