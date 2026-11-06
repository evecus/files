package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class c81 {
    public static final Object j = new Object();
    public static volatile c81 k;
    public final ReentrantReadWriteLock a;
    public final bq b;
    public volatile byte c;
    public final Handler d;
    public final y71 e;
    public final b81 f;
    public final jp g;
    public final boolean h;
    public final qr0 i;

    public c81(zj1 zj1Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        b81 b81Var = zj1Var.a;
        this.f = b81Var;
        boolean z = zj1Var.b;
        this.h = z;
        this.i = zj1Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new bq(0);
        this.g = new jp((byte) 20);
        y71 y71Var = new y71(this);
        this.e = y71Var;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                b81Var.a(new x71(y71Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static c81 a() {
        c81 c81Var;
        synchronized (j) {
            try {
                c81Var = k;
                if (!(c81Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c81Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (c() == 1) {
            sv2.q(charSequence, "charSequence cannot be null");
            return this.e.b.g(charSequence, i);
        }
        zy.i("Not initialized yet");
        return 0;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h)) {
            zy.i("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = (byte) 0;
            this.a.writeLock().unlock();
            y71 y71Var = this.e;
            c81 c81Var = y71Var.a;
            try {
                c81Var.f.a(new x71(y71Var));
            } catch (Throwable th) {
                c81Var.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new a81(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) {
        if (!(c() == 1)) {
            zy.i("Not initialized yet");
            return null;
        }
        if (i < 0) {
            s83.t("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            s83.t("end cannot be negative");
            return null;
        }
        sv2.o("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        sv2.o("start should be < than charSequence length", i <= charSequence.length());
        sv2.o("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        return this.e.b.r(charSequence, i, i2, i3 == 1);
    }

    public final void h(z71 z71Var) {
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(z71Var);
                this.a.writeLock().unlock();
            }
            this.d.post(new a81(Arrays.asList(z71Var), this.c, null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        y71 y71Var = this.e;
        y71Var.getClass();
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", y71Var.c.d());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
