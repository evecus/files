package coil3.fetch;

import coil3.decode.DataSource;
import coil3.decode.ImageSource;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class SourceFetchResult implements FetchResult {
    private final DataSource dataSource;
    private final String mimeType;
    private final ImageSource source;

    public SourceFetchResult(ImageSource imageSource, String str, DataSource dataSource) {
        this.source = imageSource;
        this.mimeType = str;
        this.dataSource = dataSource;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceFetchResult)) {
            return false;
        }
        SourceFetchResult sourceFetchResult = (SourceFetchResult) obj;
        return j42.c(this.source, sourceFetchResult.source) && j42.c(this.mimeType, sourceFetchResult.mimeType) && this.dataSource == sourceFetchResult.dataSource;
    }

    public final DataSource getDataSource() {
        return this.dataSource;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final ImageSource getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        String str = this.mimeType;
        return this.dataSource.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "SourceFetchResult(source=" + this.source + ", mimeType=" + this.mimeType + ", dataSource=" + this.dataSource + ")";
    }
}
