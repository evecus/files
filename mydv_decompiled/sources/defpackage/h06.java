package defpackage;

import android.content.res.XmlResourceParser;
import java.util.concurrent.atomic.AtomicInteger;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class h06 {
    public static boolean a(int i, long j) {
        return j >= 0 && j <= (1 << i);
    }

    public static final void b(XmlResourceParser xmlResourceParser) {
        int next = xmlResourceParser.next();
        while (next != 2 && next != 1) {
            next = xmlResourceParser.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
    }

    public static final int c(AtomicInteger atomicInteger, int i) {
        int i2;
        int i3;
        atomicInteger.getClass();
        do {
            i2 = atomicInteger.get();
            if ((i2 & i) != 0) {
                return 0;
            }
            i3 = i2 | i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i3;
    }
}
