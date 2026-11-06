package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Util;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.sp0;
import defpackage.x24;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    };
    public final ByteRange byteRange;
    public final String customCacheKey;
    public final byte[] data;
    public final String id;
    public final byte[] keySetId;
    public final String mimeType;
    public final List<StreamKey> streamKeys;
    public final TimeRange timeRange;
    public final Uri uri;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Builder {
        private String customCacheKey;
        private byte[] data;
        private final String id;
        private byte[] keySetId;
        private String mimeType;
        private List<StreamKey> streamKeys;
        private final Uri uri;
        private ByteRange byteRange = null;
        private TimeRange timeRange = null;

        public Builder(String str, Uri uri) {
            this.id = str;
            this.uri = uri;
        }

        public DownloadRequest build() {
            String str = this.id;
            Uri uri = this.uri;
            String str2 = this.mimeType;
            List list = this.streamKeys;
            if (list == null) {
                ay1 ay1Var = dy1.J;
                list = x24.M;
            }
            return new DownloadRequest(str, uri, str2, list, this.keySetId, this.customCacheKey, this.data, this.byteRange, this.timeRange);
        }

        public Builder setByteRange(long j, long j2) {
            this.byteRange = new ByteRange(j, j2);
            return this;
        }

        public Builder setCustomCacheKey(String str) {
            this.customCacheKey = str;
            return this;
        }

        public Builder setData(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder setKeySetId(byte[] bArr) {
            this.keySetId = bArr;
            return this;
        }

        public Builder setMimeType(String str) {
            this.mimeType = MimeTypes.normalizeMimeType(str);
            return this;
        }

        public Builder setStreamKeys(List<StreamKey> list) {
            this.streamKeys = list;
            return this;
        }

        public Builder setTimeRange(long j, long j2) {
            this.timeRange = new TimeRange(j, j2);
            return this;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(Parcel parcel) {
        this.id = (String) Util.castNonNull(parcel.readString());
        this.uri = Uri.parse((String) Util.castNonNull(parcel.readString()));
        this.mimeType = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.streamKeys = DesugarCollections.unmodifiableList(arrayList);
        this.keySetId = parcel.createByteArray();
        this.customCacheKey = parcel.readString();
        this.data = (byte[]) Util.castNonNull(parcel.createByteArray());
        this.byteRange = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
        this.timeRange = (TimeRange) parcel.readParcelable(TimeRange.class.getClassLoader());
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.uri, this.mimeType, this.streamKeys, this.keySetId, this.customCacheKey, this.data, this.byteRange, this.timeRange);
    }

    public DownloadRequest copyWithKeySetId(byte[] bArr) {
        return new DownloadRequest(this.id, this.uri, this.mimeType, this.streamKeys, bArr, this.customCacheKey, this.data, this.byteRange, this.timeRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        List list;
        sp0.o(this.id.equals(downloadRequest.id));
        if (this.streamKeys.isEmpty() || downloadRequest.streamKeys.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            list = new ArrayList(this.streamKeys);
            for (int i = 0; i < downloadRequest.streamKeys.size(); i++) {
                StreamKey streamKey = downloadRequest.streamKeys.get(i);
                if (!list.contains(streamKey)) {
                    list.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.id, downloadRequest.uri, downloadRequest.mimeType, list, downloadRequest.keySetId, downloadRequest.customCacheKey, downloadRequest.data, downloadRequest.byteRange, downloadRequest.timeRange);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.id.equals(downloadRequest.id) && this.uri.equals(downloadRequest.uri) && Objects.equals(this.mimeType, downloadRequest.mimeType) && this.streamKeys.equals(downloadRequest.streamKeys) && Arrays.equals(this.keySetId, downloadRequest.keySetId) && Objects.equals(this.customCacheKey, downloadRequest.customCacheKey) && Arrays.equals(this.data, downloadRequest.data) && Objects.equals(this.byteRange, downloadRequest.byteRange) && Objects.equals(this.timeRange, downloadRequest.timeRange);
    }

    public int hashCode() {
        int hashCode = (this.uri.hashCode() + (this.id.hashCode() * 961)) * 31;
        String str = this.mimeType;
        int hashCode2 = (Arrays.hashCode(this.keySetId) + ((this.streamKeys.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.customCacheKey;
        int hashCode3 = (Arrays.hashCode(this.data) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        ByteRange byteRange = this.byteRange;
        int hashCode4 = (hashCode3 + (byteRange != null ? byteRange.hashCode() : 0)) * 31;
        TimeRange timeRange = this.timeRange;
        return hashCode4 + (timeRange != null ? timeRange.hashCode() : 0);
    }

    public MediaItem toMediaItem(MediaItem.Builder builder) {
        return builder.setMediaId(this.id).setUri(this.uri).setCustomCacheKey(this.customCacheKey).setMimeType(this.mimeType).setStreamKeys(this.streamKeys).build();
    }

    public String toString() {
        return this.mimeType + ":" + this.id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.uri.toString());
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.streamKeys.size());
        for (int i2 = 0; i2 < this.streamKeys.size(); i2++) {
            parcel.writeParcelable(this.streamKeys.get(i2), 0);
        }
        parcel.writeByteArray(this.keySetId);
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
        parcel.writeParcelable(this.byteRange, 0);
        parcel.writeParcelable(this.timeRange, 0);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class TimeRange implements Parcelable {
        public static final Parcelable.Creator<TimeRange> CREATOR = new Parcelable.Creator<TimeRange>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.TimeRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TimeRange createFromParcel(Parcel parcel) {
                return new TimeRange(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TimeRange[] newArray(int i) {
                return new TimeRange[i];
            }
        };
        public final long durationUs;
        public final long startPositionUs;

        public TimeRange(long j, long j2) {
            sp0.o(j2 >= 0 || j2 == C.TIME_UNSET);
            this.startPositionUs = j;
            this.durationUs = j2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof TimeRange)) {
                return false;
            }
            TimeRange timeRange = (TimeRange) obj;
            return this.startPositionUs == timeRange.startPositionUs && this.durationUs == timeRange.durationUs;
        }

        public int hashCode() {
            return (((int) this.startPositionUs) * 961) + ((int) this.durationUs);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.startPositionUs);
            parcel.writeLong(this.durationUs);
        }

        public TimeRange(Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new Parcelable.Creator<ByteRange>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.ByteRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ByteRange[] newArray(int i) {
                return new ByteRange[i];
            }
        };
        public final long length;
        public final long offset;

        public ByteRange(long j, long j2) {
            sp0.o(j >= 0);
            sp0.o(j2 >= 0 || j2 == -1);
            this.offset = j;
            this.length = j2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.offset == byteRange.offset && this.length == byteRange.length;
        }

        public int hashCode() {
            return (((int) this.offset) * 961) + ((int) this.length);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.offset);
            parcel.writeLong(this.length);
        }

        public ByteRange(Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    public MediaItem toMediaItem() {
        return toMediaItem(new MediaItem.Builder());
    }

    private DownloadRequest(String str, Uri uri, String str2, List<StreamKey> list, byte[] bArr, String str3, byte[] bArr2, ByteRange byteRange, TimeRange timeRange) {
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(uri, str2);
        if (inferContentTypeForUriAndMimeType != 0 && inferContentTypeForUriAndMimeType != 2 && inferContentTypeForUriAndMimeType != 1) {
            this.byteRange = byteRange;
            this.timeRange = null;
        } else {
            sp0.m(inferContentTypeForUriAndMimeType, "customCacheKey must be null for type: %s", str3 == null);
            this.byteRange = null;
            this.timeRange = timeRange;
        }
        this.id = str;
        this.uri = uri;
        this.mimeType = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.streamKeys = DesugarCollections.unmodifiableList(arrayList);
        this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.customCacheKey = str3;
        this.data = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : Util.EMPTY_BYTE_ARRAY;
    }
}
