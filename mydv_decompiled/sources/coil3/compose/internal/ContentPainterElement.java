package coil3.compose.internal;

import coil3.ImageLoader;
import coil3.compose.AsyncImageModelEqualityDelegate;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePreviewHandler;
import coil3.compose.ConstraintsSizeResolver;
import coil3.request.ImageRequest;
import coil3.size.SizeResolver;
import defpackage.c80;
import defpackage.er0;
import defpackage.fq;
import defpackage.fq4;
import defpackage.hf1;
import defpackage.hn1;
import defpackage.j42;
import defpackage.jp0;
import defpackage.l13;
import defpackage.mu0;
import defpackage.ni0;
import defpackage.q13;
import defpackage.qe1;
import defpackage.tm1;
import defpackage.u8;
import defpackage.ut0;
import defpackage.z12;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ContentPainterElement extends q13 {
    public static final int $stable = 0;
    private final u8 alignment;
    private final float alpha;
    private final boolean clipToBounds;
    private final c80 colorFilter;
    private final String contentDescription;
    private final ni0 contentScale;
    private final int filterQuality;
    private final ImageLoader imageLoader;
    private final AsyncImageModelEqualityDelegate modelEqualityDelegate;
    private final tm1 onState;
    private final AsyncImagePreviewHandler previewHandler;
    private final ImageRequest request;
    private final tm1 transform;

    private ContentPainterElement(ImageRequest imageRequest, ImageLoader imageLoader, AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate, tm1 tm1Var, tm1 tm1Var2, int i, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, AsyncImagePreviewHandler asyncImagePreviewHandler, String str) {
        this.request = imageRequest;
        this.imageLoader = imageLoader;
        this.modelEqualityDelegate = asyncImageModelEqualityDelegate;
        this.transform = tm1Var;
        this.onState = tm1Var2;
        this.filterQuality = i;
        this.alignment = u8Var;
        this.contentScale = ni0Var;
        this.alpha = f;
        this.colorFilter = c80Var;
        this.clipToBounds = z;
        this.previewHandler = asyncImagePreviewHandler;
        this.contentDescription = str;
    }

    private final ImageRequest component1() {
        return this.request;
    }

    private final c80 component10() {
        return this.colorFilter;
    }

    private final boolean component11() {
        return this.clipToBounds;
    }

    private final AsyncImagePreviewHandler component12() {
        return this.previewHandler;
    }

    private final String component13() {
        return this.contentDescription;
    }

    private final ImageLoader component2() {
        return this.imageLoader;
    }

    private final AsyncImageModelEqualityDelegate component3() {
        return this.modelEqualityDelegate;
    }

    private final tm1 component4() {
        return this.transform;
    }

    private final tm1 component5() {
        return this.onState;
    }

    /* renamed from: component6-f-v9h1I, reason: not valid java name */
    private final int m66component6fv9h1I() {
        return this.filterQuality;
    }

    private final u8 component7() {
        return this.alignment;
    }

    private final ni0 component8() {
        return this.contentScale;
    }

    private final float component9() {
        return this.alpha;
    }

    /* renamed from: copy-3ECvelE$default, reason: not valid java name */
    public static /* synthetic */ ContentPainterElement m67copy3ECvelE$default(ContentPainterElement contentPainterElement, ImageRequest imageRequest, ImageLoader imageLoader, AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate, tm1 tm1Var, tm1 tm1Var2, int i, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, AsyncImagePreviewHandler asyncImagePreviewHandler, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            imageRequest = contentPainterElement.request;
        }
        return contentPainterElement.m68copy3ECvelE(imageRequest, (i2 & 2) != 0 ? contentPainterElement.imageLoader : imageLoader, (i2 & 4) != 0 ? contentPainterElement.modelEqualityDelegate : asyncImageModelEqualityDelegate, (i2 & 8) != 0 ? contentPainterElement.transform : tm1Var, (i2 & 16) != 0 ? contentPainterElement.onState : tm1Var2, (i2 & 32) != 0 ? contentPainterElement.filterQuality : i, (i2 & 64) != 0 ? contentPainterElement.alignment : u8Var, (i2 & 128) != 0 ? contentPainterElement.contentScale : ni0Var, (i2 & 256) != 0 ? contentPainterElement.alpha : f, (i2 & 512) != 0 ? contentPainterElement.colorFilter : c80Var, (i2 & 1024) != 0 ? contentPainterElement.clipToBounds : z, (i2 & 2048) != 0 ? contentPainterElement.previewHandler : asyncImagePreviewHandler, (i2 & 4096) != 0 ? contentPainterElement.contentDescription : str);
    }

    @Override // defpackage.q13, defpackage.l13
    public /* bridge */ /* synthetic */ boolean all(tm1 tm1Var) {
        return hf1.a(this, tm1Var);
    }

    public boolean any(tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    /* renamed from: copy-3ECvelE, reason: not valid java name */
    public final ContentPainterElement m68copy3ECvelE(ImageRequest imageRequest, ImageLoader imageLoader, AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate, tm1 tm1Var, tm1 tm1Var2, int i, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, AsyncImagePreviewHandler asyncImagePreviewHandler, String str) {
        return new ContentPainterElement(imageRequest, imageLoader, asyncImageModelEqualityDelegate, tm1Var, tm1Var2, i, u8Var, ni0Var, f, c80Var, z, asyncImagePreviewHandler, str, null);
    }

    @Override // defpackage.q13
    public ContentPainterNode create() {
        AsyncImagePainter.Input input = new AsyncImagePainter.Input(this.imageLoader, this.request, this.modelEqualityDelegate);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(input);
        asyncImagePainter.setTransform$io_coil_kt_coil3_coil_compose_core(this.transform);
        asyncImagePainter.setOnState$io_coil_kt_coil3_coil_compose_core(this.onState);
        asyncImagePainter.setContentScale$io_coil_kt_coil3_coil_compose_core(this.contentScale);
        asyncImagePainter.m44setFilterQualityvDHp3xo$io_coil_kt_coil3_coil_compose_core(this.filterQuality);
        asyncImagePainter.setPreviewHandler$io_coil_kt_coil3_coil_compose_core(this.previewHandler);
        asyncImagePainter.set_input$io_coil_kt_coil3_coil_compose_core(input);
        SizeResolver sizeResolver = this.request.getSizeResolver();
        return new ContentPainterNode(asyncImagePainter, this.alignment, this.contentScale, this.alpha, this.colorFilter, this.clipToBounds, this.contentDescription, sizeResolver instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) sizeResolver : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return j42.c(this.request, contentPainterElement.request) && j42.c(this.imageLoader, contentPainterElement.imageLoader) && j42.c(this.modelEqualityDelegate, contentPainterElement.modelEqualityDelegate) && j42.c(this.transform, contentPainterElement.transform) && j42.c(this.onState, contentPainterElement.onState) && this.filterQuality == contentPainterElement.filterQuality && j42.c(this.alignment, contentPainterElement.alignment) && j42.c(this.contentScale, contentPainterElement.contentScale) && Float.compare(this.alpha, contentPainterElement.alpha) == 0 && j42.c(this.colorFilter, contentPainterElement.colorFilter) && this.clipToBounds == contentPainterElement.clipToBounds && j42.c(this.previewHandler, contentPainterElement.previewHandler) && j42.c(this.contentDescription, contentPainterElement.contentDescription);
    }

    @Override // defpackage.q13, defpackage.l13
    public Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    public Object foldOut(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(this, obj);
    }

    public int hashCode() {
        int hashCode = (this.transform.hashCode() + ((this.modelEqualityDelegate.hashCode() + ((this.imageLoader.hashCode() + (this.request.hashCode() * 31)) * 31)) * 31)) * 31;
        tm1 tm1Var = this.onState;
        int o = jp0.o(this.alpha, (this.contentScale.hashCode() + ((this.alignment.hashCode() + ((((hashCode + (tm1Var == null ? 0 : tm1Var.hashCode())) * 31) + this.filterQuality) * 31)) * 31)) * 31, 31);
        c80 c80Var = this.colorFilter;
        int hashCode2 = (((o + (c80Var == null ? 0 : c80Var.hashCode())) * 31) + (this.clipToBounds ? 1231 : 1237)) * 31;
        AsyncImagePreviewHandler asyncImagePreviewHandler = this.previewHandler;
        int hashCode3 = (hashCode2 + (asyncImagePreviewHandler == null ? 0 : asyncImagePreviewHandler.hashCode())) * 31;
        String str = this.contentDescription;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.q13
    public void inspectableProperties(z12 z12Var) {
        z12Var.a = "content";
        fq fqVar = z12Var.c;
        fqVar.b(this.request, "request");
        fqVar.b(this.imageLoader, "imageLoader");
        fqVar.b(this.modelEqualityDelegate, "modelEqualityDelegate");
        fqVar.b(this.transform, "transform");
        fqVar.b(this.onState, "onState");
        fqVar.b(new qe1(this.filterQuality), "filterQuality");
        fqVar.b(this.alignment, "alignment");
        fqVar.b(this.contentScale, "contentScale");
        fqVar.b(Float.valueOf(this.alpha), "alpha");
        fqVar.b(this.colorFilter, "colorFilter");
        fqVar.b(Boolean.valueOf(this.clipToBounds), "clipToBounds");
        fqVar.b(this.previewHandler, "previewHandler");
        fqVar.b(this.contentDescription, "contentDescription");
    }

    @Override // defpackage.q13, defpackage.l13
    public /* bridge */ /* synthetic */ l13 then(l13 l13Var) {
        return hf1.e(this, l13Var);
    }

    public String toString() {
        ImageRequest imageRequest = this.request;
        ImageLoader imageLoader = this.imageLoader;
        AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate = this.modelEqualityDelegate;
        tm1 tm1Var = this.transform;
        tm1 tm1Var2 = this.onState;
        String a = qe1.a(this.filterQuality);
        u8 u8Var = this.alignment;
        ni0 ni0Var = this.contentScale;
        float f = this.alpha;
        c80 c80Var = this.colorFilter;
        boolean z = this.clipToBounds;
        AsyncImagePreviewHandler asyncImagePreviewHandler = this.previewHandler;
        String str = this.contentDescription;
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(imageRequest);
        sb.append(", imageLoader=");
        sb.append(imageLoader);
        sb.append(", modelEqualityDelegate=");
        sb.append(asyncImageModelEqualityDelegate);
        sb.append(", transform=");
        sb.append(tm1Var);
        sb.append(", onState=");
        sb.append(tm1Var2);
        sb.append(", filterQuality=");
        sb.append(a);
        sb.append(", alignment=");
        sb.append(u8Var);
        sb.append(", contentScale=");
        sb.append(ni0Var);
        sb.append(", alpha=");
        sb.append(f);
        sb.append(", colorFilter=");
        sb.append(c80Var);
        sb.append(", clipToBounds=");
        sb.append(z);
        sb.append(", previewHandler=");
        sb.append(asyncImagePreviewHandler);
        sb.append(", contentDescription=");
        return hf1.z(sb, str, ")");
    }

    @Override // defpackage.q13
    public void update(ContentPainterNode contentPainterNode) {
        long mo43getIntrinsicSizeNHjbRc = contentPainterNode.getPainter().mo43getIntrinsicSizeNHjbRc();
        ConstraintsSizeResolver constraintSizeResolver = contentPainterNode.getConstraintSizeResolver();
        AsyncImagePainter.Input input = new AsyncImagePainter.Input(this.imageLoader, this.request, this.modelEqualityDelegate);
        AsyncImagePainter painter = contentPainterNode.getPainter();
        painter.setTransform$io_coil_kt_coil3_coil_compose_core(this.transform);
        painter.setOnState$io_coil_kt_coil3_coil_compose_core(this.onState);
        painter.setContentScale$io_coil_kt_coil3_coil_compose_core(this.contentScale);
        painter.m44setFilterQualityvDHp3xo$io_coil_kt_coil3_coil_compose_core(this.filterQuality);
        painter.setPreviewHandler$io_coil_kt_coil3_coil_compose_core(this.previewHandler);
        painter.set_input$io_coil_kt_coil3_coil_compose_core(input);
        boolean a = fq4.a(mo43getIntrinsicSizeNHjbRc, painter.mo43getIntrinsicSizeNHjbRc());
        contentPainterNode.setAlignment(this.alignment);
        SizeResolver sizeResolver = this.request.getSizeResolver();
        contentPainterNode.setConstraintSizeResolver(sizeResolver instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) sizeResolver : null);
        contentPainterNode.setContentScale(this.contentScale);
        contentPainterNode.setAlpha(this.alpha);
        contentPainterNode.setColorFilter(this.colorFilter);
        contentPainterNode.setClipToBounds(this.clipToBounds);
        if (!j42.c(contentPainterNode.getContentDescription(), this.contentDescription)) {
            contentPainterNode.setContentDescription(this.contentDescription);
            ut0.U(contentPainterNode).I();
        }
        boolean c = j42.c(constraintSizeResolver, contentPainterNode.getConstraintSizeResolver());
        if (!a || !c) {
            ut0.U(contentPainterNode).H();
        }
        mu0.I(contentPainterNode);
    }

    public /* synthetic */ ContentPainterElement(ImageRequest imageRequest, ImageLoader imageLoader, AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate, tm1 tm1Var, tm1 tm1Var2, int i, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, AsyncImagePreviewHandler asyncImagePreviewHandler, String str, er0 er0Var) {
        this(imageRequest, imageLoader, asyncImageModelEqualityDelegate, tm1Var, tm1Var2, i, u8Var, ni0Var, f, c80Var, z, asyncImagePreviewHandler, str);
    }
}
