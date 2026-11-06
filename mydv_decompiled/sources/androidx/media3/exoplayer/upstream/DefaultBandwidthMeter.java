package androidx.media3.exoplayer.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.C;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import defpackage.dy1;
import defpackage.iy1;
import defpackage.j42;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_MASK = 7;
    private static final int COUNTRY_GROUP_SHIFT_2G = 3;
    private static final int COUNTRY_GROUP_SHIFT_3G = 6;
    private static final int COUNTRY_GROUP_SHIFT_4G = 9;
    private static final int COUNTRY_GROUP_SHIFT_5G_NSA = 12;
    private static final int COUNTRY_GROUP_SHIFT_5G_SA = 15;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final dy1 DEFAULT_INITIAL_BITRATE_ESTIMATES_3G;
    public static final dy1 DEFAULT_INITIAL_BITRATE_ESTIMATES_4G;
    public static final dy1 DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA;
    public static final dy1 DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final Context context;
    private String countryCode;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final iy1 initialBitrateEstimates;
    private final InitialBitrateSupplier initialBitrateSupplier;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final dy1 DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = dy1.s(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final dy1 DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = dy1.s(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface InitialBitrateSupplier {
        long getInitialBitrateEstimate(int i);
    }

    static {
        Long valueOf = Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = dy1.s(valueOf, 1300000L, 1000000L, 860000L, 610000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = dy1.s(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = dy1.s(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = dy1.s(2700000L, valueOf, 1600000L, 1300000L, 1000000L);
    }

    private DefaultBandwidthMeter(Context context, Map<Integer, Long> map, int i, Clock clock, boolean z, InitialBitrateSupplier initialBitrateSupplier) {
        this.context = context == null ? null : context.getApplicationContext();
        this.initialBitrateEstimates = iy1.a(map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z;
        this.initialBitrateSupplier = initialBitrateSupplier;
        if (context == null) {
            this.networkType = 0;
            this.bitrateEstimate = 1000000L;
            return;
        }
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: dr0
            @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i2) {
                DefaultBandwidthMeter.this.onNetworkTypeChanged(i2);
            }
        }, BackgroundExecutor.get());
    }

    private static int getInitialBitrateCountryGroupAssignment(String str) {
        str.getClass();
        switch (str) {
            case "AD":
            case "AI":
            case "BB":
            case "BQ":
            case "CW":
            case "DM":
            case "KN":
            case "KY":
            case "SX":
            case "VC":
                return 73745;
            case "AE":
                return 50849;
            case "AF":
            case "SZ":
                return 76004;
            case "AG":
            case "CI":
                return 76002;
            case "AL":
                return 74825;
            case "AM":
            case "PA":
                return 75418;
            case "AO":
                return 75555;
            case "AQ":
            case "ER":
            case "NU":
            case "SC":
            case "SH":
                return 74900;
            case "AR":
                return 70802;
            case "AS":
                return 75474;
            case "AT":
            case "EE":
            case "HU":
            case "IS":
            case "LV":
            case "MT":
            case "SE":
                return 65536;
            case "AU":
                return 12888;
            case "AW":
                return 75986;
            case "AX":
            case "CX":
            case "LI":
            case "MS":
            case "PM":
            case "SM":
            case "VA":
                return 74896;
            case "AZ":
            case "DJ":
            case "LY":
            case "SL":
                return 75476;
            case "BA":
            case "JO":
            case "TR":
                return 74313;
            case "BD":
                return 83146;
            case "BE":
                return 69696;
            case "BF":
            case "SD":
            case "SY":
            case "TD":
                return 76060;
            case "BG":
            case "PT":
            case "SI":
                return 69632;
            case "BH":
                return 83545;
            case "BI":
            case "GQ":
            case "HT":
            case "NE":
            case "VE":
            case "YE":
                return 76068;
            case "BJ":
                return 75428;
            case "BL":
            case "MP":
            case "PY":
                return 74897;
            case "BM":
                return 73744;
            case "BN":
                return 73747;
            case "BO":
                return 76049;
            case "BR":
                return 139849;
            case "BS":
                return 74323;
            case "BT":
                return 78987;
            case "BW":
                return 73811;
            case "BY":
                return 75473;
            case "BZ":
            case "CK":
                return 74386;
            case "CA":
            case "UA":
                return 111696;
            case "CD":
            case "ML":
                return 74907;
            case "CF":
                return 75028;
            case "CG":
            case "EG":
            case "MG":
                return 75491;
            case "CH":
                return 65544;
            case "CL":
            case "TH":
                return 74888;
            case "CM":
            case "MR":
                return 75996;
            case "CN":
                return 45634;
            case "CO":
                return 74970;
            case "CR":
            case "NI":
                return 76066;
            case "CU":
            case "KI":
            case "NR":
            case "TL":
                return 76052;
            case "CV":
                return 74266;
            case "CY":
                return 65601;
            case "CZ":
                return 69760;
            case "DE":
                return 42248;
            case "DK":
                return 65664;
            case "DO":
            case "LR":
                return 76067;
            case "DZ":
            case "TJ":
                return 76059;
            case "EC":
                return 74393;
            case "ES":
                return 4096;
            case "ET":
                return 84252;
            case "FI":
                return 66048;
            case "FJ":
                return 75411;
            case "FK":
            case "NF":
            case "SJ":
                return 74899;
            case "FM":
                return 74004;
            case "FO":
                return 73872;
            case "FR":
                return 66121;
            case "GA":
                return 73763;
            case "GB":
                return 74953;
            case "GD":
                return 73746;
            case "GE":
                return 74761;
            case "GF":
                return 75475;
            case "GG":
                return 74320;
            case "GH":
                return 74971;
            case "GI":
            case "IM":
            case "JE":
                return 74256;
            case "GL":
            case "MC":
                return 73873;
            case "GM":
            case "SS":
                return 75932;
            case "GN":
                return 75043;
            case "GP":
                return 75338;
            case "GR":
                return 69633;
            case "GT":
                return 74378;
            case "GU":
                return 79634;
            case "GW":
                return 74852;
            case "GY":
                return 75339;
            case "HK":
                return 4616;
            case "HR":
            case "KW":
                return 65537;
            case "ID":
                return 141003;
            case "IE":
                return 70217;
            case "IL":
                return 83601;
            case "IN":
                return 107721;
            case "IO":
                return 73875;
            case "IQ":
                return 74963;
            case "IR":
                return 116436;
            case "IT":
                return 70728;
            case "JM":
                return 74466;
            case "JP":
                return 83608;
            case "KE":
                return 70227;
            case "KG":
                return 74826;
            case "KH":
                return 75009;
            case "KM":
            case "VU":
                return 74972;
            case "KR":
                return 149648;
            case "KZ":
                return 78986;
            case "LA":
                return 75345;
            case "LB":
                return 74827;
            case "LC":
                return 74322;
            case "LK":
            case "MM":
                return 83667;
            case "LS":
            case "PG":
                return 75484;
            case "LT":
                return 66056;
            case "LU":
                return 103620;
            case "MA":
                return 74331;
            case "MD":
                return 73729;
            case "ME":
                return 78338;
            case "MF":
                return 75409;
            case "MH":
            case "TM":
            case "TV":
            case "WF":
                return 75924;
            case "MK":
                return 78337;
            case "MN":
                return 74882;
            case "MO":
                return 47376;
            case "MQ":
                return 75402;
            case "MU":
                return 74763;
            case "MV":
                return 83539;
            case "MW":
                return 74387;
            case "MX":
                return 80162;
            case "MY":
                return 4865;
            case "MZ":
            case "WS":
                return 74891;
            case "NA":
                return 74979;
            case "NC":
            case "YT":
                return 75994;
            case "NG":
                return 74403;
            case "NL":
                return 132874;
            case "NO":
                return 65728;
            case "NP":
                return 75538;
            case "NZ":
                return 83008;
            case "OM":
                return 83034;
            case "PE":
                return 80145;
            case "PF":
                return 74450;
            case "PH":
                return 42634;
            case "PK":
                return 75483;
            case "PL":
                return 148609;
            case "PR":
                return 8834;
            case "PS":
                return 75363;
            case "PW":
                return 74514;
            case "QA":
                return 84257;
            case "RE":
                return 71320;
            case "RO":
                return 78400;
            case "RS":
                return 74241;
            case "RU":
                return 111105;
            case "RW":
                return 73883;
            case "SA":
                return 9291;
            case "SB":
            case "ZW":
                return 75540;
            case "SG":
                return 38618;
            case "SK":
                return 74312;
            case "SN":
                return 74980;
            case "SO":
                return 84178;
            case "SR":
                return 74530;
            case "ST":
                return 74834;
            case "SV":
                return 74394;
            case "TC":
                return 74835;
            case "TG":
                return 73827;
            case "TN":
                return 74315;
            case "TO":
                return 75539;
            case "TT":
                return 73826;
            case "TW":
                return 0;
            case "TZ":
                return 78499;
            case "UG":
                return 83611;
            case "US":
                return 45842;
            case "UY":
                return 70730;
            case "UZ":
                return 80081;
            case "VG":
                return 139858;
            case "VI":
                return 74832;
            case "VN":
                return 74816;
            case "XK":
                return 74321;
            case "ZA":
                return 70306;
            case "ZM":
                return 75556;
            default:
                return 74898;
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        InitialBitrateSupplier initialBitrateSupplier = this.initialBitrateSupplier;
        if (initialBitrateSupplier != null) {
            long initialBitrateEstimate = initialBitrateSupplier.getInitialBitrateEstimate(i);
            if (initialBitrateEstimate != C.TIME_UNSET) {
                return initialBitrateEstimate;
            }
        }
        Long l = (Long) this.initialBitrateEstimates.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.initialBitrateEstimates.get(0);
        } else if (l.longValue() == C.TIME_UNSET) {
            l = Long.valueOf(getInitialBitrateEstimatesForCountry(this.countryCode, i));
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getInitialBitrateEstimatesForCountry(String str, int i) {
        if (str == null) {
            str = "";
        }
        int initialBitrateCountryGroupAssignment = getInitialBitrateCountryGroupAssignment(str);
        if (i != 2) {
            if (i == 3) {
                return ((Long) DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get((initialBitrateCountryGroupAssignment >> 3) & 7)).longValue();
            }
            if (i == 4) {
                return ((Long) DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get((initialBitrateCountryGroupAssignment >> 6) & 7)).longValue();
            }
            if (i == 5) {
                return ((Long) DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get((initialBitrateCountryGroupAssignment >> 9) & 7)).longValue();
            }
            if (i != 7) {
                if (i == 9) {
                    return ((Long) DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get((initialBitrateCountryGroupAssignment >> 15) & 7)).longValue();
                }
                if (i != 10) {
                    return 1000000L;
                }
                return ((Long) DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get((initialBitrateCountryGroupAssignment >> 12) & 7)).longValue();
            }
        }
        return ((Long) DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment & 7)).longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        DefaultBandwidthMeter defaultBandwidthMeter;
        synchronized (DefaultBandwidthMeter.class) {
            defaultBandwidthMeter = singletonInstance;
            if (defaultBandwidthMeter == null) {
                defaultBandwidthMeter = new Builder(context).build();
                singletonInstance = defaultBandwidthMeter;
            }
        }
        return defaultBandwidthMeter;
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.isFlagSet(8);
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j2;
        this.eventDispatcher.bandwidthSample(i, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i) {
        DefaultBandwidthMeter defaultBandwidthMeter;
        Throwable th;
        try {
            try {
                int i2 = this.networkType;
                if (i2 != 0) {
                    try {
                        if (!this.resetOnNetworkTypeChange) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        defaultBandwidthMeter = this;
                        throw th;
                    }
                }
                if (this.networkTypeOverrideSet) {
                    i = this.networkTypeOverride;
                }
                if (i2 != i || this.countryCode == null) {
                    this.networkType = i;
                    if (i == 1 || i == 0 || i == 8) {
                        return;
                    }
                    if (this.countryCode == null) {
                        this.countryCode = Util.getCountryCode(this.context);
                    }
                    this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i);
                    long elapsedRealtime = this.clock.elapsedRealtime();
                    maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (elapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                    this.sampleStartTimeMs = elapsedRealtime;
                    this.sampleBytesTransferred = 0L;
                    this.totalBytesTransferred = 0L;
                    this.totalElapsedTimeMs = 0L;
                    this.slidingPercentile.reset();
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            defaultBandwidthMeter = this;
            th = th;
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        handler.getClass();
        eventListener.getClass();
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            this.sampleBytesTransferred += i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10.totalBytesTransferred >= 524288) goto L22;
     */
    @Override // androidx.media3.datasource.TransferListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferEnd(androidx.media3.datasource.DataSource r11, androidx.media3.datasource.DataSpec r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = isTransferAtFullNetworkSpeed(r12, r13)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.streamCount     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = r12
            goto L11
        L10:
            r11 = 0
        L11:
            defpackage.sp0.z(r11)     // Catch: java.lang.Throwable -> L72
            androidx.media3.common.util.Clock r11 = r10.clock     // Catch: java.lang.Throwable -> L72
            long r0 = r11.elapsedRealtime()     // Catch: java.lang.Throwable -> L72
            long r2 = r10.sampleStartTimeMs     // Catch: java.lang.Throwable -> L72
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L72
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.totalElapsedTimeMs = r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.totalBytesTransferred = r2     // Catch: java.lang.Throwable -> L72
            if (r5 <= 0) goto L75
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L72
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L72
            float r11 = r11 / r13
            androidx.media3.exoplayer.upstream.SlidingPercentile r13 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L72
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L72
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L72
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L72
            r13.addSample(r2, r11)     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L72
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L55
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L51
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L60
            goto L55
        L51:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        L55:
            androidx.media3.exoplayer.upstream.SlidingPercentile r11 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L72
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.getPercentile(r13)     // Catch: java.lang.Throwable -> L72
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L72
            r10.bitrateEstimate = r2     // Catch: java.lang.Throwable -> L72
        L60:
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r8 = r10.bitrateEstimate     // Catch: java.lang.Throwable -> L72
            r4 = r10
            r4.maybeNotifyBandwidthSample(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
            r4.sampleStartTimeMs = r0     // Catch: java.lang.Throwable -> L6f
            r10 = 0
            r4.sampleBytesTransferred = r10     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r11 = r0
            goto L7d
        L72:
            r0 = move-exception
            r4 = r10
            goto L70
        L75:
            r4 = r10
        L76:
            int r10 = r4.streamCount     // Catch: java.lang.Throwable -> L6f
            int r10 = r10 - r12
            r4.streamCount = r10     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return
        L7d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.onTransferEnd(androidx.media3.datasource.DataSource, androidx.media3.datasource.DataSpec, boolean):void");
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        try {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                if (this.streamCount == 0) {
                    this.sampleStartTimeMs = this.clock.elapsedRealtime();
                }
                this.streamCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i) {
        this.networkTypeOverride = i;
        this.networkTypeOverrideSet = true;
        onNetworkTypeChanged(i);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private Clock clock;
        private final Context context;
        private final Map<Integer, Long> initialBitrateEstimates;
        private InitialBitrateSupplier initialBitrateSupplier;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            Long valueOf = Long.valueOf(C.TIME_UNSET);
            this.context = context == null ? null : context.getApplicationContext();
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
            HashMap hashMap = new HashMap(8);
            this.initialBitrateEstimates = hashMap;
            hashMap.put(0, 1000000L);
            hashMap.put(2, valueOf);
            hashMap.put(3, valueOf);
            hashMap.put(4, valueOf);
            hashMap.put(5, valueOf);
            hashMap.put(10, valueOf);
            hashMap.put(9, valueOf);
            hashMap.put(7, valueOf);
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange, this.initialBitrateSupplier);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setInitialBitrateEstimate(String str) {
            String k0 = j42.k0(str);
            for (Integer num : this.initialBitrateEstimates.keySet()) {
                setInitialBitrateEstimate(num.intValue(), DefaultBandwidthMeter.getInitialBitrateEstimatesForCountry(k0, num.intValue()));
            }
            return this;
        }

        public Builder setInitialBitrateSupplier(InitialBitrateSupplier initialBitrateSupplier) {
            this.initialBitrateSupplier = initialBitrateSupplier;
            return this;
        }

        public Builder setResetOnNetworkTypeChange(boolean z) {
            this.resetOnNetworkTypeChange = z;
            return this;
        }

        public Builder setSlidingWindowMaxWeight(int i) {
            this.slidingWindowMaxWeight = i;
            return this;
        }

        public Builder setInitialBitrateEstimate(int i, long j) {
            this.initialBitrateEstimates.put(Integer.valueOf(i), Long.valueOf(j));
            return this;
        }

        public Builder setInitialBitrateEstimate(long j) {
            Iterator<Integer> it = this.initialBitrateEstimates.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j);
            }
            return this;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }
}
