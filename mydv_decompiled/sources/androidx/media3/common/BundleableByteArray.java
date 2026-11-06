package androidx.media3.common;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SharedMemory;
import android.system.OsConstants;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import defpackage.dy1;
import defpackage.rt0;
import defpackage.zx1;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BundleableByteArray {
    private static final String FIELD_IN_PROCESS_BINDER = Util.intToStringMaxRadix(0);
    private static final String FIELD_SHARED_MEMORY = Util.intToStringMaxRadix(1);
    private static final String FIELD_SPLIT_ARRAY_RETRIEVER = Util.intToStringMaxRadix(2);
    private static final String TAG = "BundleableByteArray";
    private final byte[] byteArray;
    private final InProcessBinder inProcessBinder = new InProcessBinder();
    SharedMemoryApi27 sharedMemoryApi27;
    SplitArrayRetriever splitArrayRetriever;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public final class InProcessBinder extends Binder {
        private InProcessBinder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] getByteArray() {
            return BundleableByteArray.this.byteArray;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class SharedMemoryApi27 {
        private final SharedMemory sharedMemory;

        private SharedMemoryApi27(SharedMemory sharedMemory) {
            this.sharedMemory = sharedMemory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static SharedMemoryApi27 create(byte[] bArr) {
            SharedMemory sharedMemory;
            try {
                sharedMemory = SharedMemory.create(BundleableByteArray.TAG, bArr.length);
            } catch (Exception e) {
                e = e;
                sharedMemory = null;
            }
            try {
                ByteBuffer mapReadWrite = sharedMemory.mapReadWrite();
                mapReadWrite.put(bArr);
                SharedMemory.unmap(mapReadWrite);
                sharedMemory.setProtect(OsConstants.PROT_READ);
                return new SharedMemoryApi27(sharedMemory);
            } catch (Exception e2) {
                e = e2;
                Log.w(BundleableByteArray.TAG, "Failed to allocate shared memory for byte array, size=" + bArr.length, e);
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] readFromBundle(Bundle bundle) {
            ByteBuffer byteBuffer;
            SharedMemory sharedMemory = (SharedMemory) bundle.getParcelable(BundleableByteArray.FIELD_SHARED_MEMORY);
            try {
                if (sharedMemory == null) {
                    return null;
                }
                try {
                    byteBuffer = sharedMemory.mapReadOnly();
                    try {
                        byte[] bArr = new byte[sharedMemory.getSize()];
                        byteBuffer.get(bArr);
                        SharedMemory.unmap(byteBuffer);
                        sharedMemory.close();
                        return bArr;
                    } catch (Exception e) {
                        e = e;
                        Log.w(BundleableByteArray.TAG, "Failed to read byte array from shared memory", e);
                        if (byteBuffer != null) {
                            SharedMemory.unmap(byteBuffer);
                        }
                        sharedMemory.close();
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    byteBuffer = null;
                } catch (Throwable th) {
                    th = th;
                    if (0 != 0) {
                        SharedMemory.unmap(null);
                    }
                    sharedMemory.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToBundle(Bundle bundle) {
            bundle.putParcelable(BundleableByteArray.FIELD_SHARED_MEMORY, this.sharedMemory);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class SplitArrayRetriever {
        private static final String BUNDLE_KEY = "bytes";
        private static final int CHUNK_SIZE = C.SUGGESTED_MAX_IPC_SIZE;
        private final BundleListRetriever bundleListRetriever;

        private SplitArrayRetriever(byte[] bArr) {
            zx1 n = dy1.n();
            int ceilDivide = Util.ceilDivide(bArr.length, CHUNK_SIZE);
            for (int i = 0; i < ceilDivide; i++) {
                Bundle bundle = new Bundle();
                int i2 = CHUNK_SIZE;
                int i3 = i * i2;
                bundle.putByteArray(BUNDLE_KEY, Arrays.copyOfRange(bArr, i3, Math.min(i2 + i3, bArr.length)));
                n.c(bundle);
            }
            this.bundleListRetriever = new BundleListRetriever(n.f());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] readFromBundle(Bundle bundle) {
            IBinder binder = bundle.getBinder(BundleableByteArray.FIELD_SPLIT_ARRAY_RETRIEVER);
            if (binder == null) {
                return null;
            }
            try {
                dy1 list = BundleListRetriever.getList(binder);
                if (list.isEmpty()) {
                    return Util.EMPTY_BYTE_ARRAY;
                }
                byte[] byteArray = ((Bundle) rt0.z(list)).getByteArray(BUNDLE_KEY);
                if (byteArray == null) {
                    return null;
                }
                int size = list.size() - 1;
                int i = CHUNK_SIZE;
                byte[] bArr = new byte[(size * i) + byteArray.length];
                System.arraycopy(byteArray, 0, bArr, i * size, byteArray.length);
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] byteArray2 = ((Bundle) list.get(i2)).getByteArray(BUNDLE_KEY);
                    if (byteArray2 != null) {
                        int length = byteArray2.length;
                        int i3 = CHUNK_SIZE;
                        if (length == i3) {
                            System.arraycopy(byteArray2, 0, bArr, i2 * i3, i3);
                        }
                    }
                    return null;
                }
                return bArr;
            } catch (RuntimeException e) {
                Log.w(BundleableByteArray.TAG, "Failed to read byte array from bundle list retriever", e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToBundle(Bundle bundle) {
            bundle.putBinder(BundleableByteArray.FIELD_SPLIT_ARRAY_RETRIEVER, this.bundleListRetriever);
        }
    }

    public BundleableByteArray(byte[] bArr) {
        this.byteArray = bArr;
    }

    public static byte[] fromBundle(Bundle bundle) {
        byte[] readFromBundle;
        IBinder binder = bundle.getBinder(FIELD_IN_PROCESS_BINDER);
        if (binder == null) {
            return null;
        }
        return binder instanceof InProcessBinder ? ((InProcessBinder) binder).getByteArray() : (Build.VERSION.SDK_INT < 27 || (readFromBundle = SharedMemoryApi27.readFromBundle(bundle)) == null) ? SplitArrayRetriever.readFromBundle(bundle) : readFromBundle;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBinder(FIELD_IN_PROCESS_BINDER, this.inProcessBinder);
        if (Build.VERSION.SDK_INT >= 27) {
            byte[] bArr = this.byteArray;
            if (bArr.length > 0) {
                SharedMemoryApi27 sharedMemoryApi27 = this.sharedMemoryApi27;
                if (sharedMemoryApi27 == null) {
                    sharedMemoryApi27 = SharedMemoryApi27.create(bArr);
                    this.sharedMemoryApi27 = sharedMemoryApi27;
                }
                if (sharedMemoryApi27 != null) {
                    sharedMemoryApi27.writeToBundle(bundle);
                    return bundle;
                }
            }
        }
        SplitArrayRetriever splitArrayRetriever = this.splitArrayRetriever;
        if (splitArrayRetriever == null) {
            splitArrayRetriever = new SplitArrayRetriever(this.byteArray);
            this.splitArrayRetriever = splitArrayRetriever;
        }
        splitArrayRetriever.writeToBundle(bundle);
        return bundle;
    }
}
