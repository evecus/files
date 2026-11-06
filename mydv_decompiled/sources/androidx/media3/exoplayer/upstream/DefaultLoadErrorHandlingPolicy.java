package androidx.media3.exoplayer.upstream;

import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    private static final int DEFAULT_BEHAVIOR_MIN_LOADABLE_RETRY_COUNT = -1;
    public static final long DEFAULT_LOCATION_EXCLUSION_MS = 300000;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;

    @Deprecated
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    public static final long DEFAULT_TRACK_EXCLUSION_MS = 60000;
    private final int minimumLoadableRetryCount;

    public DefaultLoadErrorHandlingPolicy(int i) {
        this.minimumLoadableRetryCount = i;
    }

    private boolean isAnyCauseNonRetriable(Throwable th) {
        while (th != null) {
            if (isNonRetriableException(th)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    private boolean isNonRetriableException(Throwable th) {
        if ((th instanceof ParserException) || (th instanceof FileNotFoundException) || (th instanceof HttpDataSource.CleartextNotPermittedException) || (th instanceof Loader.UnexpectedLoaderException)) {
            return true;
        }
        return (th instanceof DataSourceException) && ((DataSourceException) th).reason == 2008;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        if (!isEligibleForFallback(loadErrorInfo.exception)) {
            return null;
        }
        if (fallbackOptions.locationSteeringActive) {
            if (fallbackOptions.isFallbackAvailable(2)) {
                return new LoadErrorHandlingPolicy.FallbackSelection(2, 60000L);
            }
            if (fallbackOptions.isFallbackAvailable(1)) {
                return new LoadErrorHandlingPolicy.FallbackSelection(1, 300000L);
            }
        } else {
            if (fallbackOptions.isFallbackAvailable(1)) {
                return new LoadErrorHandlingPolicy.FallbackSelection(1, 300000L);
            }
            if (fallbackOptions.isFallbackAvailable(2)) {
                return new LoadErrorHandlingPolicy.FallbackSelection(2, 60000L);
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public int getMinimumLoadableRetryCount(int i) {
        int i2 = this.minimumLoadableRetryCount;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        return isAnyCauseNonRetriable(loadErrorInfo.exception) ? C.TIME_UNSET : Math.min((loadErrorInfo.errorCount - 1) * 1000, 5000);
    }

    public boolean isEligibleForFallback(IOException iOException) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public final /* synthetic */ void onLoadTaskConcluded(long j) {
    }
}
