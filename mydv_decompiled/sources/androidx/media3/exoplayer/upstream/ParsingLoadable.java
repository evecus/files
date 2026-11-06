package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ParsingLoadable<T> implements Loader.Loadable {
    private final StatsDataSource dataSource;
    public final DataSpec dataSpec;
    public final long loadTaskId;
    private final Parser<? extends T> parser;
    private volatile T result;
    public final String steeredPathwayId;
    public final int type;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Parser<T> {
        T parse(Uri uri, InputStream inputStream);
    }

    private ParsingLoadable(Builder<T> builder) {
        this.dataSource = new StatsDataSource(((Builder) builder).dataSource);
        this.dataSpec = ((Builder) builder).dataSpec;
        this.type = ((Builder) builder).type;
        this.parser = ((Builder) builder).parser;
        this.steeredPathwayId = ((Builder) builder).steeredPathwayId;
        this.loadTaskId = LoadEventInfo.getNewId();
    }

    public long bytesLoaded() {
        return this.dataSource.getBytesRead();
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.dataSource.getLastResponseHeaders();
    }

    public final T getResult() {
        return this.result;
    }

    public Uri getUri() {
        return this.dataSource.getLastOpenedUri();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() {
        this.dataSource.resetBytesRead();
        DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.dataSource, this.dataSpec);
        try {
            dataSourceInputStream.open();
            Uri uri = this.dataSource.getUri();
            uri.getClass();
            this.result = this.parser.parse(uri, dataSourceInputStream);
        } finally {
            Util.closeQuietly(dataSourceInputStream);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder<T> {
        private final DataSource dataSource;
        private final DataSpec dataSpec;
        private final Parser<? extends T> parser;
        private String steeredPathwayId;
        private final int type;

        public Builder(DataSource dataSource, Uri uri, int i, Parser<? extends T> parser) {
            this(dataSource, new DataSpec.Builder().setUri(uri).setFlags(1).build(), i, parser);
        }

        public ParsingLoadable<T> build() {
            return new ParsingLoadable<>(this);
        }

        public Builder<T> setSteeredPathwayId(String str) {
            this.steeredPathwayId = str;
            return this;
        }

        public Builder(DataSource dataSource, DataSpec dataSpec, int i, Parser<? extends T> parser) {
            this.dataSource = dataSource;
            this.dataSpec = dataSpec;
            this.type = i;
            this.parser = parser;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
    }

    public static <T> T load(DataSource dataSource, Parser<? extends T> parser, DataSpec dataSpec, int i) {
        ParsingLoadable<T> build = new Builder(dataSource, dataSpec, i, parser).build();
        build.load();
        T result = build.getResult();
        result.getClass();
        return result;
    }

    @Deprecated
    public ParsingLoadable(DataSource dataSource, Uri uri, int i, Parser<? extends T> parser) {
        this(dataSource, new DataSpec.Builder().setUri(uri).setFlags(1).build(), i, parser);
    }

    @Deprecated
    public ParsingLoadable(DataSource dataSource, DataSpec dataSpec, int i, Parser<? extends T> parser) {
        this.dataSource = new StatsDataSource(dataSource);
        this.dataSpec = dataSpec;
        this.type = i;
        this.parser = parser;
        this.steeredPathwayId = null;
        this.loadTaskId = LoadEventInfo.getNewId();
    }

    public static <T> T load(DataSource dataSource, Parser<? extends T> parser, Uri uri, int i) {
        ParsingLoadable<T> build = new Builder(dataSource, uri, i, parser).build();
        build.load();
        T result = build.getResult();
        result.getClass();
        return result;
    }
}
