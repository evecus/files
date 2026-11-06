package coil3.decode;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import coil3.decode.ImageSource;
import coil3.decode.StaticImageDecoderKt;
import coil3.request.Options;
import defpackage.j42;
import defpackage.ke1;
import defpackage.ok3;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class StaticImageDecoderKt {
    public static final ImageDecoder.Source toImageDecoderSourceOrNull(ImageSource imageSource, Options options, boolean z) {
        ok3 fileOrNull;
        if (imageSource.getFileSystem() == ke1.SYSTEM && (fileOrNull = imageSource.fileOrNull()) != null) {
            return ImageDecoder.createSource(fileOrNull.toFile());
        }
        ImageSource.Metadata metadata = imageSource.getMetadata();
        if (metadata instanceof AssetMetadata) {
            return ImageDecoder.createSource(options.getContext().getAssets(), ((AssetMetadata) metadata).getFilePath());
        }
        if ((metadata instanceof ContentMetadata) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptor = ((ContentMetadata) metadata).getAssetFileDescriptor();
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: ow4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        AssetFileDescriptor imageDecoderSourceOrNull$lambda$0;
                        imageDecoderSourceOrNull$lambda$0 = StaticImageDecoderKt.toImageDecoderSourceOrNull$lambda$0(assetFileDescriptor);
                        return imageDecoderSourceOrNull$lambda$0;
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof ResourceMetadata) {
            ResourceMetadata resourceMetadata = (ResourceMetadata) metadata;
            if (j42.c(resourceMetadata.getPackageName(), options.getContext().getPackageName())) {
                return ImageDecoder.createSource(options.getContext().getResources(), resourceMetadata.getResId());
            }
        }
        if (!(metadata instanceof ByteBufferMetadata)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((ByteBufferMetadata) metadata).getByteBuffer().isDirect()) {
            return ImageDecoder.createSource(((ByteBufferMetadata) metadata).getByteBuffer());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetFileDescriptor toImageDecoderSourceOrNull$lambda$0(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
