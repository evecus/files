package j$.io;

import j$.util.Objects;
import j$.util.q1;
import j$.util.stream.Stream;
import j$.util.stream.v3;
import java.io.BufferedReader;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class DesugarBufferedReader {
    public static Stream lines(BufferedReader bufferedReader) {
        return v3.Z(new q1((Iterator) Objects.requireNonNull(new a(bufferedReader))), false);
    }
}
