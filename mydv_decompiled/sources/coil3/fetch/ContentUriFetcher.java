package coil3.fetch;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.common.MimeTypes;
import coil3.ImageLoader;
import coil3.Uri;
import coil3.UriKt;
import coil3.Uri_androidKt;
import coil3.decode.ContentMetadata;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import coil3.size.Dimension;
import defpackage.fj0;
import defpackage.j42;
import defpackage.o70;
import defpackage.s04;
import defpackage.sp0;
import defpackage.zy;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ContentUriFetcher implements Fetcher {
    private final Uri data;
    private final Options options;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        private final boolean isApplicable(Uri uri) {
            return j42.c(uri.getScheme(), "content");
        }

        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            if (isApplicable(uri)) {
                return new ContentUriFetcher(uri, options);
            }
            return null;
        }
    }

    public ContentUriFetcher(Uri uri, Options options) {
        this.data = uri;
        this.options = options;
    }

    private final Bundle newMusicThumbnailSizeOptions() {
        Dimension width = this.options.getSize().getWidth();
        Dimension.Pixels pixels = width instanceof Dimension.Pixels ? (Dimension.Pixels) width : null;
        if (pixels != null) {
            int m116unboximpl = pixels.m116unboximpl();
            Dimension height = this.options.getSize().getHeight();
            Dimension.Pixels pixels2 = height instanceof Dimension.Pixels ? (Dimension.Pixels) height : null;
            if (pixels2 != null) {
                int m116unboximpl2 = pixels2.m116unboximpl();
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("android.content.extra.SIZE", new Point(m116unboximpl, m116unboximpl2));
                return bundle;
            }
        }
        return null;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        android.net.Uri androidUri = Uri_androidKt.toAndroidUri(this.data);
        ContentResolver contentResolver = this.options.getContext().getContentResolver();
        if (isContactPhotoUri$io_coil_kt_coil3_coil_core(this.data)) {
            openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(androidUri, "r");
            if (openAssetFileDescriptor == null) {
                zy.g(androidUri, "'.", "Unable to find a contact photo associated with '");
                return null;
            }
        } else if (Build.VERSION.SDK_INT < 29 || !isMusicThumbnailUri$io_coil_kt_coil3_coil_core(this.data)) {
            openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(androidUri, "r");
            if (openAssetFileDescriptor == null) {
                zy.g(androidUri, "'.", "Unable to open '");
                return null;
            }
        } else {
            openAssetFileDescriptor = contentResolver.openTypedAssetFile(androidUri, "image/*", newMusicThumbnailSizeOptions(), null);
            if (openAssetFileDescriptor == null) {
                zy.g(androidUri, "'.", "Unable to find a music thumbnail associated with '");
                return null;
            }
        }
        return new SourceFetchResult(ImageSourceKt.ImageSource(new s04(sp0.e0(openAssetFileDescriptor.createInputStream())), this.options.getFileSystem(), new ContentMetadata(this.data, openAssetFileDescriptor)), contentResolver.getType(androidUri), DataSource.DISK);
    }

    public final boolean isContactPhotoUri$io_coil_kt_coil3_coil_core(Uri uri) {
        return j42.c(uri.getAuthority(), "com.android.contacts") && j42.c(o70.b1(UriKt.getPathSegments(uri)), "display_photo");
    }

    public final boolean isMusicThumbnailUri$io_coil_kt_coil3_coil_core(Uri uri) {
        List<String> pathSegments;
        int size;
        return j42.c(uri.getAuthority(), "media") && (size = (pathSegments = UriKt.getPathSegments(uri)).size()) >= 3 && j42.c(pathSegments.get(size + (-3)), MimeTypes.BASE_TYPE_AUDIO) && j42.c(pathSegments.get(size + (-2)), "albums");
    }
}
