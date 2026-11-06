package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface EbmlProcessor {
    public static final int ELEMENT_TYPE_BINARY = 4;
    public static final int ELEMENT_TYPE_FLOAT = 5;
    public static final int ELEMENT_TYPE_MASTER = 1;
    public static final int ELEMENT_TYPE_STRING = 3;
    public static final int ELEMENT_TYPE_UNKNOWN = 0;
    public static final int ELEMENT_TYPE_UNSIGNED_INT = 2;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({java.lang.annotation.ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ElementType {
    }

    void binaryElement(int i, int i2, ExtractorInput extractorInput);

    void endMasterElement(int i);

    void floatElement(int i, double d);

    int getElementType(int i);

    void integerElement(int i, long j);

    boolean isLevel1Element(int i);

    void startMasterElement(int i, long j, long j2);

    void stringElement(int i, String str);
}
