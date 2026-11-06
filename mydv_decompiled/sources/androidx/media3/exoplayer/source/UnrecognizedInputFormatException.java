package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.SniffFailure;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.x24;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final dy1 sniffFailures;
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = dy1.p(list);
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.sniffFailures.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + this.sniffFailures;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, x24.M);
        ay1 ay1Var = dy1.J;
    }
}
