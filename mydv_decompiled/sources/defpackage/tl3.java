package defpackage;

import j$.io.BufferedReaderRetargetInterface;
import j$.io.DesugarBufferedReader;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class tl3 extends BufferedReader implements BufferedReaderRetargetInterface {
    public static final Logger I = Logger.getLogger(tl3.class.getName());

    @Override // java.io.BufferedReader, j$.io.BufferedReaderRetargetInterface
    public /* synthetic */ Stream lines() {
        return DesugarBufferedReader.lines(this);
    }
}
