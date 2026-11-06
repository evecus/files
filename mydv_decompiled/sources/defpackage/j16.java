package defpackage;

import android.R;
import android.os.Build;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.TsExtractor;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.LiveDanmakuSettings;
import com.github.mytv.dv.model.LiveRoom;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class j16 {
    public static final tc0 C;
    public static final tc0 L;
    public static final tc0 N;
    public static Method g0;
    public static boolean h0;
    public static final tc0 t;
    public static final tc0 w;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] h = {R.attr.ordering};
    public static final int[] i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final n84 l = new n84(15);
    public static final n84 m = new n84(16);
    public static final yx3 n = new yx3();
    public static final float[][] o = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] p = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] q = {95.047f, 100.0f, 108.883f};
    public static final double[][] r = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] s = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final tc0 u = new tc0(1361027952, new uc0(5), false);
    public static final tc0 v = new tc0(1710621175, new bd0((byte) 20), false);
    public static final tc0 x = new tc0(-409119507, new uc0(19), false);
    public static final tc0 y = new tc0(-338989148, new cd0(1), false);
    public static final tc0 z = new tc0(1684744790, new cd0(2), false);
    public static final tc0 A = new tc0(1677364469, new uc0(20), false);
    public static final tc0 B = new tc0(1669984148, new uc0(21), false);
    public static final tc0 D = new tc0(-850355890, new uc0(23), false);
    public static final tc0 E = new tc0(-2046494191, new uc0(24), false);
    public static final tc0 F = new tc0(1662603827, new uc0(25), false);
    public static final tc0 G = new tc0(-60310677, new uc0(26), false);
    public static final tc0 H = new tc0(-857736211, new uc0(27), false);
    public static final tc0 I = new tc0(1734594126, new uc0(28), false);
    public static final tc0 J = new tc0(514181694, new bd0((byte) 21), false);
    public static final tc0 K = new tc0(-1769336442, new uc0(29), false);
    public static final tc0 M = new tc0(-449063358, new bd0((byte) 23), false);
    public static final n84 O = new n84(27);
    public static final l80 P = l80.T;
    public static final l80 Q = l80.U;
    public static final float R = 0.38f;
    public static final float S = 6.0f;
    public static final float T = 1.0f;
    public static final double[][] U = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] V = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] W = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] X = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final j81 Y = new j81((byte) 9);
    public static final int[][] Z = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] a0 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] b0 = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, HttpStatusCodesKt.HTTP_PROCESSING, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, HttpStatusCodesKt.HTTP_PROCESSING, WebSocketProtocol.PAYLOAD_SHORT, -1}, new int[]{6, 26, 52, 78, 104, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, -1}, new int[]{6, 30, 56, 82, 108, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, -1}, new int[]{6, 34, 60, 86, 112, TsExtractor.TS_STREAM_TYPE_DTS, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, HttpStatusCodesKt.HTTP_PROCESSING, WebSocketProtocol.PAYLOAD_SHORT, 150}, new int[]{6, 24, 50, 76, HttpStatusCodesKt.HTTP_PROCESSING, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, TsExtractor.TS_STREAM_TYPE_DTS_HD, 162}, new int[]{6, 26, 54, 82, 110, TsExtractor.TS_STREAM_TYPE_DTS, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] c0 = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static final int[] d0 = {0, 25847, -2608894, -518909, 237124, -777960, -876248, 466468, 1826347, 2353451, -359251, -2091905, 3119733, -2884855, 3111497, 2680103, 2725464, 1024112, -1079900, 3585928, -549488, -1119584, 2619752, -2108549, -2118186, -3859737, -1399561, -3277672, 1757237, -19422, 4010497, 280005, 2706023, 95776, 3077325, 3530437, -1661693, -3592148, -2537516, 3915439, -3861115, -3043716, 3574422, -2867647, 3539968, -300467, 2348700, -539299, -1699267, -1643818, 3505694, -3821735, 3507263, -2140649, -1600420, 3699596, 811944, 531354, 954230, 3881043, 3900724, -2556880, 2071892, -2797779, -3930395, -1528703, -3677745, -3041255, -1452451, 3475950, 2176455, -1585221, -1257611, 1939314, -4083598, -1000202, -3190144, -3157330, -3632928, 126922, 3412210, -983419, 2147896, 2715295, -2967645, -3693493, -411027, -2477047, -671102, -1228525, -22981, -1308169, -381987, 1349076, 1852771, -1430430, -3343383, 264944, 508951, 3097992, 44288, -1100098, 904516, 3958618, -3724342, -8578, 1653064, -3249728, 2389356, -210977, 759969, -1316856, 189548, -3553272, 3159746, -1851402, -2409325, -177440, 1315589, 1341330, 1285669, -1584928, -812732, -1439742, -3019102, -3881060, -3628969, 3839961, 2091667, 3407706, 2316500, 3817976, -3342478, 2244091, -2446433, -3562462, 266997, 2434439, -1235728, 3513181, -3520352, -3759364, -1197226, -3193378, 900702, 1859098, 909542, 819034, 495491, -1613174, -43260, -522500, -655327, -3122442, 2031748, 3207046, -3556995, -525098, -768622, -3595838, 342297, 286988, -2437823, 4108315, 3437287, -3342277, 1735879, 203044, 2842341, 2691481, -2590150, 1265009, 4055324, 1247620, 2486353, 1595974, -3767016, 1250494, 2635921, -3548272, -2994039, 1869119, 1903435, -1050970, -1333058, 1237275, -3318210, -1430225, -451100, 1312455, 3306115, -1962642, -1279661, 1917081, -2546312, -1374803, 1500165, 777191, 2235880, 3406031, -542412, -2831860, -1671176, -1846953, -2584293, -3724270, 594136, -3776993, -2013608, 2432395, 2454455, -164721, 1957272, 3369112, 185531, -1207385, -3183426, 162844, 1616392, 3014001, 810149, 1652634, -3694233, -1799107, -3038916, 3523897, 3866901, 269760, 2213111, -975884, 1717735, 472078, -426683, 1723600, -1803090, 1910376, -1667432, -1104333, -260646, -3833893, -2939036, -2235985, -420899, -2286327, 183443, -976891, 1612842, -3545687, -554416, 3919660, -48306, -1362209, 3937738, 1400424, -846154, 1976782};
    public static final StackTraceElement[] e0 = new StackTraceElement[0];
    public static final Object f0 = new Object();
    public static final int[] i0 = {-1, -1, -1, -3};
    public static final int[] j0 = {1, 0, 0, 4, -2, -1, 3, -4};
    public static final int[] k0 = {-1, -1, -1, -5, 1, 0, -4, 3};
    public static final int[] l0 = {-1, -1, -2, -1, -1, -1};
    public static final int[] m0 = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    public static final int[] n0 = {-1, -1, -3, -1, -2, -1, 1, 0, 2};
    public static final int[] o0 = {-1, -1, -1, 0, 0, 0, 1, -1};
    public static final int[] p0 = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};
    public static final long[] q0 = {-5270498306774157648L, 5270498306774195053L, 19634136210L};
    public static final j81 r0 = new j81((byte) 25);
    public static final StackTraceElement[] s0 = new StackTraceElement[0];
    public static final Object t0 = new Object();
    public static final Object u0 = new Object();
    public static final Object v0 = new Object();
    public static final Object w0 = new Object();
    public static final Object x0 = new Object();
    public static final a7 y0 = new a7("android.widget.extra.CHECKED");

    static {
        byte b2 = 0;
        t = new tc0(-1847066964, new uc0(b2), false);
        w = new tc0(1340773150, new bd0(b2), false);
        byte b3 = 22;
        C = new tc0(1741974447, new uc0(b3), false);
        L = new tc0(-1281993919, new bd0(b3), false);
        N = new tc0(-865116532, new cd0(b2), false);
    }

    public static double B(double[] dArr) {
        double d2 = dArr[0];
        double[][] dArr2 = U;
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0]);
        double s2 = s(d7);
        double s3 = s(d8);
        double s4 = s(d9);
        return Math.atan2(r7.p(s4, 2.0d, s2 + s3, 9.0d), ((((-12.0d) * s3) + (s2 * 11.0d)) + s4) / 11.0d);
    }

    public static void C(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = (j3 >>> 46) ^ (jArr[2] << 18);
        long j5 = ((j3 << 9) ^ (j2 >>> 55)) & 36028797018963967L;
        long j6 = j2 & 36028797018963967L;
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = (j8 >>> 46) ^ (jArr2[2] << 18);
        long j10 = ((j7 >>> 55) ^ (j8 << 9)) & 36028797018963967L;
        long j11 = j7 & 36028797018963967L;
        long[] jArr4 = new long[10];
        D(jArr3, j6, j11, jArr4, 0);
        D(jArr3, j4, j9, jArr4, 2);
        long j12 = (j6 ^ j5) ^ j4;
        long j13 = (j11 ^ j10) ^ j9;
        D(jArr3, j12, j13, jArr4, 4);
        long j14 = (j5 << 1) ^ (j4 << 2);
        long j15 = (j10 << 1) ^ (j9 << 2);
        D(jArr3, j6 ^ j14, j11 ^ j15, jArr4, 6);
        D(jArr3, j12 ^ j14, j13 ^ j15, jArr4, 8);
        long j16 = jArr4[6];
        long j17 = jArr4[8] ^ j16;
        long j18 = jArr4[7];
        long j19 = j18 ^ jArr4[9];
        long j20 = (j17 << 1) ^ j16;
        long j21 = (j17 ^ (j19 << 1)) ^ j18;
        long j22 = jArr4[0];
        long j23 = jArr4[1];
        long j24 = (j23 ^ j22) ^ jArr4[4];
        long j25 = j23 ^ jArr4[5];
        long j26 = jArr4[2];
        long j27 = ((j20 ^ j22) ^ (j26 << 4)) ^ (j26 << 1);
        long j28 = jArr4[3];
        long j29 = (((j24 ^ j21) ^ (j28 << 4)) ^ (j28 << 1)) ^ (j27 >>> 55);
        long j30 = (j25 ^ j19) ^ (j29 >>> 55);
        long j31 = ((j27 & 36028797018963967L) >>> 1) ^ ((j29 & 1) << 54);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 36028797018963967L;
        long j38 = (((j29 & 36028797018963967L) >>> 1) ^ ((j30 & 1) << 54)) ^ (j37 >>> 54);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = 36028797018963967L & (j43 ^ (j43 << 32));
        long j45 = (j30 >>> 1) ^ (j44 >>> 54);
        long j46 = j45 ^ (j45 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j50 = j49 ^ (j49 << 16);
        long j51 = j50 ^ (j50 << 32);
        jArr3[0] = j22;
        long j52 = (j24 ^ j37) ^ j26;
        jArr3[1] = j52;
        long j53 = ((j25 ^ j44) ^ j37) ^ j28;
        jArr3[2] = j53;
        long j54 = j44 ^ j51;
        jArr3[3] = j54;
        long j55 = j51 ^ jArr4[2];
        jArr3[4] = j55;
        long j56 = jArr4[3];
        jArr3[5] = j56;
        jArr3[0] = j22 ^ (j52 << 55);
        jArr3[1] = (j52 >>> 9) ^ (j53 << 46);
        jArr3[2] = (j53 >>> 18) ^ (j54 << 37);
        jArr3[3] = (j54 >>> 27) ^ (j55 << 28);
        jArr3[4] = (j55 >>> 36) ^ (j56 << 19);
        jArr3[5] = j56 >>> 45;
    }

    public static void D(long[] jArr, long j2, long j3, long[] jArr2, int i2) {
        jArr[1] = j3;
        long j4 = j3 << 1;
        jArr[2] = j4;
        long j5 = j4 ^ j3;
        jArr[3] = j5;
        long j6 = j3 << 2;
        jArr[4] = j6;
        jArr[5] = j6 ^ j3;
        long j7 = j5 << 1;
        jArr[6] = j7;
        jArr[7] = j7 ^ j3;
        long j8 = jArr[((int) j2) & 3];
        long j9 = 0;
        int i3 = 47;
        do {
            int i4 = (int) (j2 >>> i3);
            long j10 = (jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 9;
        } while (i3 > 0);
        jArr2[i2] = 36028797018963967L & j8;
        jArr2[i2 + 1] = (j8 >>> 55) ^ (j9 << 9);
    }

    public static int E(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = q;
        return w90.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static double F(double d2) {
        double abs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1);
    }

    public static boolean G(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static boolean H(int i2) {
        return i2 == -1;
    }

    public static final l13 I(l13 l13Var, md mdVar, oh2 oh2Var, u45 u45Var) {
        return l13Var.then(new gh2(mdVar, oh2Var, u45Var));
    }

    public static float J(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void L(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        jl2.Z(iArr, iArr2, iArr4);
        O(iArr4, iArr3);
    }

    public static void M(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        C(jArr, jArr2, jArr4);
        P(jArr4, jArr3);
    }

    public static void N(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        lq2.V(iArr, iArr2, iArr4);
        Q(iArr4, iArr3);
    }

    public static void O(int[] iArr, int[] iArr2) {
        long j2 = iArr[7] & 4294967295L;
        long j3 = (iArr[6] & 4294967295L) + (j2 << 1);
        long j4 = (iArr[2] & 4294967295L) + j3;
        long j5 = (iArr[5] & 4294967295L) + (j3 << 1);
        long j6 = (iArr[4] & 4294967295L) + (j5 << 1);
        long j7 = (iArr[0] & 4294967295L) + j6;
        iArr2[0] = (int) j7;
        long j8 = (iArr[1] & 4294967295L) + j5 + (j7 >>> 32);
        iArr2[1] = (int) j8;
        long j9 = j4 + (j8 >>> 32);
        iArr2[2] = (int) j9;
        long j10 = (iArr[3] & 4294967295L) + j2 + (j6 << 1) + (j9 >>> 32);
        iArr2[3] = (int) j10;
        S((int) (j10 >>> 32), iArr2);
    }

    public static void P(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = j5 ^ ((((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)) ^ (j7 >>> 28));
        long j9 = (j4 ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36))) ^ ((j6 >>> 28) ^ (((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)));
        long j10 = j2 ^ ((((j8 << 29) ^ (j8 << 32)) ^ (j8 << 35)) ^ (j8 << 36));
        long j11 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j8 >>> 28) ^ (((j8 >>> 35) ^ (j8 >>> 32)) ^ (j8 >>> 29)));
        long j12 = j9 >>> 35;
        jArr2[0] = (((j10 ^ j12) ^ (j12 << 3)) ^ (j12 << 6)) ^ (j12 << 7);
        jArr2[1] = j11;
        jArr2[2] = 34359738367L & j9;
    }

    public static void Q(int[] iArr, int[] iArr2) {
        long j2 = iArr[6] & 4294967295L;
        long j3 = iArr[7] & 4294967295L;
        long j4 = (iArr[10] & 4294967295L) + j2;
        long j5 = (iArr[11] & 4294967295L) + j3;
        long j6 = (iArr[0] & 4294967295L) + j4;
        int i2 = (int) j6;
        long j7 = (iArr[1] & 4294967295L) + j5 + (j6 >> 32);
        int i3 = (int) j7;
        iArr2[1] = i3;
        long j8 = j4 + (iArr[8] & 4294967295L);
        long j9 = j5 + (iArr[9] & 4294967295L);
        long j10 = (iArr[2] & 4294967295L) + j8 + (j7 >> 32);
        long j11 = j10 & 4294967295L;
        long j12 = (iArr[3] & 4294967295L) + j9 + (j10 >> 32);
        iArr2[3] = (int) j12;
        long j13 = (iArr[4] & 4294967295L) + (j8 - j2) + (j12 >> 32);
        iArr2[4] = (int) j13;
        long j14 = (iArr[5] & 4294967295L) + (j9 - j3) + (j13 >> 32);
        iArr2[5] = (int) j14;
        long j15 = j14 >> 32;
        long j16 = j11 + j15;
        long j17 = j15 + (i2 & 4294967295L);
        iArr2[0] = (int) j17;
        long j18 = j17 >> 32;
        if (j18 != 0) {
            long j19 = j18 + (i3 & 4294967295L);
            iArr2[1] = (int) j19;
            j16 += j19 >> 32;
        }
        iArr2[2] = (int) j16;
        if (((j16 >> 32) == 0 || dq2.Y(6, 3, iArr2) == 0) && !(iArr2[5] == -1 && lq2.M(iArr2, l0))) {
            return;
        }
        m(iArr2);
    }

    public static void R(int[] iArr, int[] iArr2) {
        long j2 = iArr[9] & 4294967295L;
        long j3 = iArr[10] & 4294967295L;
        long j4 = iArr[11] & 4294967295L;
        long j5 = iArr[12] & 4294967295L;
        long j6 = iArr[13] & 4294967295L;
        long j7 = iArr[14] & 4294967295L;
        long j8 = iArr[15] & 4294967295L;
        long j9 = (iArr[8] & 4294967295L) - 6;
        long j10 = j9 + j2;
        long j11 = j2 + j3;
        long j12 = (j3 + j4) - j8;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = j15 - j10;
        long j18 = ((iArr[0] & 4294967295L) - j13) - j17;
        iArr2[0] = (int) j18;
        long j19 = ((((iArr[1] & 4294967295L) + j11) - j14) - j16) + (j18 >> 32);
        iArr2[1] = (int) j19;
        long j20 = (((iArr[2] & 4294967295L) + j12) - j15) + (j19 >> 32);
        iArr2[2] = (int) j20;
        long j21 = ((((iArr[3] & 4294967295L) + (j13 << 1)) + j17) - j16) + (j20 >> 32);
        iArr2[3] = (int) j21;
        long j22 = ((((iArr[4] & 4294967295L) + (j14 << 1)) + j7) - j11) + (j21 >> 32);
        iArr2[4] = (int) j22;
        long j23 = (((iArr[5] & 4294967295L) + (j15 << 1)) - j12) + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = (iArr[6] & 4294967295L) + (j16 << 1) + j17 + (j23 >> 32);
        iArr2[6] = (int) j24;
        long j25 = (((((iArr[7] & 4294967295L) + (j8 << 1)) + j9) - j12) - j14) + (j24 >> 32);
        iArr2[7] = (int) j25;
        U((int) ((j25 >> 32) + 6), iArr2);
    }

    public static void S(int i2, int[] iArr) {
        while (i2 != 0) {
            long j2 = i2 & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (4294967295L & iArr[3]) + (j2 << 1) + j4;
            iArr[3] = (int) j7;
            i2 = (int) (j7 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !jl2.J(iArr, i0)) {
            return;
        }
        l(iArr);
    }

    public static void T(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2 & 4294967295L;
            long j4 = (iArr[0] & 4294967295L) + j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = (4294967295L & iArr[2]) + j3 + j5;
            iArr[2] = (int) j7;
            j2 = j7 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || dq2.Y(6, 3, iArr) == 0) && !(iArr[5] == -1 && lq2.M(iArr, l0))) {
            return;
        }
        m(iArr);
    }

    public static void U(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2 & 4294967295L;
            long j4 = (iArr[0] & 4294967295L) + j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j6;
                long j7 = (j6 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j7;
                j5 = j7 >> 32;
            }
            long j8 = ((iArr[3] & 4294967295L) - j3) + j5;
            iArr[3] = (int) j8;
            long j9 = j8 >> 32;
            if (j9 != 0) {
                long j10 = j9 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j10;
                long j11 = (j10 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j11;
                j9 = j11 >> 32;
            }
            long j12 = ((iArr[6] & 4294967295L) - j3) + j9;
            iArr[6] = (int) j12;
            long j13 = (4294967295L & iArr[7]) + j3 + (j12 >> 32);
            iArr[7] = (int) j13;
            j2 = j13 >> 32;
        } else {
            j2 = 0;
        }
        if (j2 != 0 || (iArr[7] == -1 && jl2.K(iArr, o0))) {
            n(iArr);
        }
    }

    public static final rv4 V(pq5 pq5Var, dl0 dl0Var, long j2, long j3) {
        pq5Var.getClass();
        dl0Var.getClass();
        fk3 fk3Var = pq5Var.a;
        float h2 = fk3Var.h() < 1.1f ? 1.0f : fk3Var.h();
        long b2 = h2 <= 1.0f ? 0L : pq5.b(pq5Var.c(), j2, j3, h2);
        if (h2 == fk3Var.h() && pd3.c(b2, pq5Var.c())) {
            return null;
        }
        rv4 g02 = p70.g0(dl0Var, null, null, new oq5(pq5Var, fk3Var.h(), h2, pq5Var.c(), b2, null), 3);
        pq5Var.d = g02;
        return g02;
    }

    public static kp W(float f2) {
        return new kp(f2, false, null);
    }

    public static void X(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        jl2.i0(iArr, iArr3);
        O(iArr3, iArr2);
    }

    public static void Y(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        lq2.g0(iArr, iArr3);
        Q(iArr3, iArr2);
    }

    public static void Z(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        jl2.i0(iArr, iArr3);
        while (true) {
            O(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                jl2.i0(iArr2, iArr3);
            }
        }
    }

    public static final void a(rm1 rm1Var, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1892906035);
        byte b2 = 1;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            g(rm1Var, null, p70.u0(-1090492866, new h30(((fw2) go1Var.k(lw2.b)).a, (byte) 4), go1Var), go1Var, 438);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new qa0(rm1Var, i2, b2);
        }
    }

    public static void a0(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        jl2.j0(iArr, iArr3);
        while (true) {
            R(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                jl2.j0(iArr2, iArr3);
            }
        }
    }

    public static final void b(final op2 op2Var, final wm4 wm4Var, final rm1 rm1Var, final rm1 rm1Var2, final l13 l13Var, final boolean z2, final tm1 tm1Var, fe0 fe0Var, int i2) {
        go1 go1Var;
        op2 op2Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        bw0 bw0Var;
        boolean z6;
        Object obj;
        int i3;
        t43 t43Var;
        t43 t43Var2;
        List list;
        t43 t43Var3;
        op2Var.getClass();
        wm4Var.getClass();
        rm1Var.getClass();
        rm1Var2.getClass();
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(136504169);
        int i4 = i2 | (go1Var2.i(op2Var) ? 4 : 2) | (go1Var2.i(wm4Var) ? 32 : 16) | (go1Var2.i(rm1Var) ? 256 : 128) | (go1Var2.i(rm1Var2) ? 2048 : 1024) | (go1Var2.h(z2) ? 131072 : 65536);
        boolean z7 = true;
        if (go1Var2.T(i4 & 1, (599187 & i4) != 599186)) {
            final t43 g2 = wi4.g(op2Var.A, go1Var2);
            final t43 g3 = wi4.g(op2Var.F, go1Var2);
            final t43 g4 = wi4.g(op2Var.H, go1Var2);
            final t43 g5 = wi4.g(op2Var.l, go1Var2);
            t43 g6 = wi4.g(wm4Var.h, go1Var2);
            final k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
            final iu0 iu0Var = (iu0) go1Var2.k(hf0.h);
            bw0 bw0Var2 = (bw0) go1Var2.k(cw0.a);
            final cj1 cj1Var = (cj1) go1Var2.k(dj1.a);
            br3 br3Var = cj1Var.a;
            boolean z8 = br3Var == br3.J;
            boolean z9 = br3Var == br3.K;
            if (on5.M0(bw0Var2) || z8) {
                z3 = z8;
                z4 = true;
            } else {
                z3 = z8;
                z4 = false;
            }
            boolean z10 = bw0Var2.c == aw0.I;
            final long j2 = k80Var.a;
            Object Q2 = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = pt1.r(go1Var2);
            }
            final ki1 ki1Var = (ki1) Q2;
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                Q3 = pt1.r(go1Var2);
            }
            final ki1 ki1Var2 = (ki1) Q3;
            Object Q4 = go1Var2.Q();
            if (Q4 == jpVar) {
                Q4 = pt1.r(go1Var2);
            }
            final ki1 ki1Var3 = (ki1) Q4;
            Object Q5 = go1Var2.Q();
            if (Q5 == jpVar) {
                Q5 = pt1.r(go1Var2);
            }
            final ki1 ki1Var4 = (ki1) Q5;
            Object Q6 = go1Var2.Q();
            if (Q6 == jpVar) {
                Q6 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q6);
            }
            final t43 t43Var4 = (t43) Q6;
            Object Q7 = go1Var2.Q();
            if (Q7 == jpVar) {
                Q7 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q7);
            }
            t43 t43Var5 = (t43) Q7;
            Object Q8 = go1Var2.Q();
            if (Q8 == jpVar) {
                Q8 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q8);
            }
            t43 t43Var6 = (t43) Q8;
            final ag2 a2 = bg2.a(go1Var2);
            final boolean z11 = z4;
            Object Q9 = go1Var2.Q();
            if (Q9 == jpVar) {
                ArrayList arrayList = new ArrayList();
                z5 = z9;
                za1 za1Var = lq5.O;
                za1Var.getClass();
                bw0Var = bw0Var2;
                z6 = z3;
                v2 v2Var = new v2(za1Var, (byte) 0);
                while (v2Var.hasNext()) {
                    Object next = v2Var.next();
                    v2 v2Var2 = v2Var;
                    if (((lq5) next) != lq5.L) {
                        arrayList.add(next);
                    }
                    v2Var = v2Var2;
                }
                go1Var2.o0(arrayList);
                obj = arrayList;
            } else {
                z5 = z9;
                bw0Var = bw0Var2;
                z6 = z3;
                obj = Q9;
            }
            List list2 = (List) obj;
            boolean z12 = (i4 & 896) == 256;
            Object Q10 = go1Var2.Q();
            if (z12 || Q10 == jpVar) {
                i3 = 0;
                Q10 = new yn2(rm1Var, t43Var5, t43Var6, (byte) 0);
                go1Var2.o0(Q10);
            } else {
                i3 = 0;
            }
            Object h2 = bp3.h((rm1) Q10, go1Var2, i3);
            boolean h3 = go1Var2.h(((Boolean) t43Var5.getValue()).booleanValue()) | go1Var2.g(h2);
            Object Q11 = go1Var2.Q();
            if (h3 || Q11 == jpVar) {
                if (((Boolean) t43Var5.getValue()).booleanValue()) {
                    h2 = new d52((byte) 13);
                }
                go1Var2.o0(h2);
                Q11 = h2;
            }
            rm1 rm1Var3 = (rm1) Q11;
            Boolean bool = (Boolean) t43Var5.getValue();
            bool.getClass();
            boolean h4 = go1Var2.h(z10) | go1Var2.i(list2) | go1Var2.g(g6);
            boolean z13 = z10;
            Object Q12 = go1Var2.Q();
            if (h4 || Q12 == jpVar) {
                t43Var = t43Var5;
                t43Var2 = t43Var6;
                list = list2;
                t43Var3 = g6;
                Q12 = new fo2(z13, list, t43Var, ki1Var4, t43Var2, ki1Var3, t43Var3, ki1Var, ki1Var2, null);
                go1Var2.o0(Q12);
            } else {
                t43Var = t43Var5;
                t43Var2 = t43Var6;
                list = list2;
                t43Var3 = g6;
            }
            mw2.h(go1Var2, (hn1) Q12, bool);
            final rm1 g7 = bp3.g(go1Var2);
            ay3 a3 = bp3.b.a(rm1Var3);
            final boolean z14 = z5;
            final bw0 bw0Var3 = bw0Var;
            final boolean z15 = z6;
            final List list3 = list;
            final t43 t43Var7 = t43Var;
            final t43 t43Var8 = t43Var2;
            final t43 t43Var9 = t43Var3;
            hn1 hn1Var = new hn1() { // from class: eo2
                /* JADX WARN: Removed duplicated region for block: B:28:0x0171  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x024e  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0266  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0287  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x02b1  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x02c6  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x02f6  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x036e  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x02d6  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x02b5  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0269  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01e2  */
                @Override // defpackage.hn1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r39, java.lang.Object r40) {
                    /*
                        Method dump skipped, instructions count: 1088
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.eo2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            };
            op2Var2 = op2Var;
            go1Var = go1Var2;
            mw2.b(a3, p70.u0(1330100265, hn1Var, go1Var), go1Var, 56);
            if (((Boolean) t43Var4.getValue()).booleanValue()) {
                go1Var.d0(-720916071);
                boolean blockEnabled = ((LiveDanmakuSettings) g2.getValue()).getBlockEnabled();
                List<String> blockWords = ((LiveDanmakuSettings) g2.getValue()).getBlockWords();
                int i5 = i4 & 14;
                boolean z16 = i5 == 4 || go1Var.i(op2Var2);
                Object Q13 = go1Var.Q();
                if (z16 || Q13 == jpVar) {
                    Q13 = new co2(op2Var2, (byte) 9);
                    go1Var.o0(Q13);
                }
                tm1 tm1Var2 = (tm1) Q13;
                boolean z17 = i5 == 4 || go1Var.i(op2Var2);
                Object Q14 = go1Var.Q();
                if (z17 || Q14 == jpVar) {
                    Q14 = new co2(op2Var2, (byte) 10);
                    go1Var.o0(Q14);
                }
                tm1 tm1Var3 = (tm1) Q14;
                if (i5 != 4 && !go1Var.i(op2Var2)) {
                    z7 = false;
                }
                Object Q15 = go1Var.Q();
                byte b2 = 11;
                if (z7 || Q15 == jpVar) {
                    Q15 = new co2(op2Var2, b2);
                    go1Var.o0(Q15);
                }
                tm1 tm1Var4 = (tm1) Q15;
                Object Q16 = go1Var.Q();
                if (Q16 == jpVar) {
                    Q16 = new sf(t43Var4, b2);
                    go1Var.o0(Q16);
                }
                a5.g(blockEnabled, blockWords, tm1Var2, tm1Var3, tm1Var4, (rm1) Q16, go1Var, 196608);
                go1Var.q(false);
            } else {
                go1Var.d0(-720516295);
                go1Var.q(false);
            }
        } else {
            go1Var = go1Var2;
            op2Var2 = op2Var;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new dm2(op2Var2, wm4Var, rm1Var, rm1Var2, l13Var, z2, tm1Var, i2);
        }
    }

    public static void b0(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        e41.E(3, jArr, jArr3);
        while (true) {
            P(jArr3, jArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                e41.E(3, jArr2, jArr3);
            }
        }
    }

    public static final void c(LiveRoom liveRoom, fe0 fe0Var, int i2) {
        int i3;
        String str;
        i51 i51Var;
        k80 k80Var;
        sg sgVar;
        df0 df0Var;
        sg sgVar2;
        sg sgVar3;
        sg sgVar4;
        int i4;
        Author owner;
        Author owner2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(641430051);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? go1Var.g(liveRoom) : go1Var.i(liveRoom) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (go1Var.T(i3 & 1, (i3 & 3) != 2)) {
            i51 i51Var2 = lw2.b;
            k80 k80Var2 = ((fw2) go1Var.k(i51Var2)).a;
            String str2 = null;
            if (liveRoom == null || (owner2 = liveRoom.getOwner()) == null) {
                str = null;
            } else {
                str = (String) o70.U0(owner2.getAvatarThumb().getUrlList());
                if (str == null) {
                    str = (String) o70.U0(owner2.getAvatarMedium().getUrlList());
                }
            }
            if (str == null) {
                str = "";
            }
            if (liveRoom != null && (owner = liveRoom.getOwner()) != null) {
                str2 = owner.getNickname();
            }
            String str3 = str2 == null ? "" : str2;
            uv uvVar = q8.T;
            kp kpVar = new kp(10.0f, true, new y9());
            i13 i13Var = i13.a;
            l13 G0 = i42.G0(i13Var, 8.0f, 0.0f, 8.0f, 14.0f, 2);
            u74 a2 = t74.a(kpVar, uvVar, go1Var, 54);
            long j2 = go1Var.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, G0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z2 = go1Var.S;
            df0 df0Var2 = wa2.A0;
            if (z2) {
                go1Var.l(df0Var2);
            } else {
                go1Var.r0();
            }
            sg sgVar5 = q8.c0;
            qi4.k(go1Var, sgVar5, a2);
            sg sgVar6 = q8.b0;
            qi4.k(go1Var, sgVar6, m2);
            Integer valueOf = Integer.valueOf(i5);
            sg sgVar7 = q8.d0;
            qi4.k(go1Var, sgVar7, valueOf);
            qi4.j(go1Var);
            sg sgVar8 = q8.a0;
            qi4.k(go1Var, sgVar8, x02);
            l13 k2 = nq4.k(i13Var, 44.0f);
            jp jpVar = dw2.a;
            l13 p2 = mw2.p(o7.m(k2, rt0.L(jp.m(), go1Var)), k80Var2.H, mw2.j);
            uw2 c2 = px.c(q8.J, false);
            long j3 = go1Var.T;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            l13 x03 = i42.x0(go1Var, p2);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var2);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar5, c2);
            qi4.k(go1Var, sgVar6, m3);
            r7.G(i6, go1Var, sgVar7, go1Var);
            qi4.k(go1Var, sgVar8, x03);
            if (str.length() > 0) {
                go1Var.d0(114659755);
                sgVar4 = sgVar5;
                sgVar = sgVar6;
                df0Var = df0Var2;
                sgVar2 = sgVar8;
                sgVar3 = sgVar7;
                i4 = 0;
                i51Var = i51Var2;
                k80Var = k80Var2;
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str, go1Var), "主播头像", nq4.c, null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1573296, 0, 1976);
                go1Var.q(false);
            } else {
                i51Var = i51Var2;
                k80Var = k80Var2;
                sgVar = sgVar6;
                df0Var = df0Var2;
                sgVar2 = sgVar8;
                sgVar3 = sgVar7;
                sgVar4 = sgVar5;
                i4 = 0;
                go1Var.d0(114917737);
                go1Var.q(false);
            }
            go1Var.q(true);
            sc2 sc2Var = new sc2(1.0f, true);
            ba0 a3 = z90.a(i42.d, q8.V, go1Var, i4);
            long j4 = go1Var.T;
            int i7 = (int) (j4 ^ (j4 >>> 32));
            am3 m4 = go1Var.m();
            l13 x04 = i42.x0(go1Var, sc2Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar4, a3);
            qi4.k(go1Var, sgVar, m4);
            r7.G(i7, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar2, x04);
            i51 i51Var3 = i51Var;
            k80 k80Var3 = k80Var;
            r55.b(str3.length() == 0 ? "直播设置" : str3, null, k80Var3.q, 0L, qk1.P, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var.k(i51Var3)).b.h, go1Var, 1572864, 24960, 110522);
            go1Var = go1Var;
            if (str3.length() > 0) {
                go1Var.d0(736694721);
                r55.b("直播设置", null, k80Var3.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var3)).b.n, go1Var, 6, 24576, 114682);
                go1Var = go1Var;
                go1Var.q(false);
            } else {
                go1Var.d0(736916185);
                go1Var.q(false);
            }
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new zu0(liveRoom, i2, (byte) 4);
        }
    }

    public static void c0(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        lq2.g0(iArr, iArr3);
        while (true) {
            Q(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                lq2.g0(iArr2, iArr3);
            }
        }
    }

    public static final void d(int i2, fe0 fe0Var, rm1 rm1Var, tm1 tm1Var, String str) {
        str.getClass();
        rm1Var.getClass();
        tm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-974213381);
        byte b2 = 4;
        int i3 = (go1Var.g(str) ? 4 : 2) | i2 | (go1Var.i(tm1Var) ? 2048 : 1024);
        if (go1Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = ad4.w("");
                go1Var.o0(Q2);
            }
            t43 t43Var = (t43) Q2;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q3);
            }
            t43 t43Var2 = (t43) Q3;
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = pt1.r(go1Var);
            }
            ki1 ki1Var = (ki1) Q4;
            Object Q5 = go1Var.Q();
            fj0 fj0Var = null;
            if (Q5 == jpVar) {
                Q5 = new oo0(ki1Var, fj0Var, b2);
                go1Var.o0(Q5);
            }
            mw2.h(go1Var, (hn1) Q5, wd5.a);
            eu5.f(rm1Var, null, p70.u0(750279571, new ju3(tm1Var, t43Var, t43Var2, k80Var, str, ki1Var, (byte) 0), go1Var), go1Var, 390);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new tf((Object) str, (Object) rm1Var, (Object) tm1Var, i2, (byte) 8);
        }
    }

    public static void d0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (jl2.k0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j4;
                long j5 = (j4 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j5;
                j3 = j5 >> 32;
            }
            iArr3[3] = (int) (((4294967295L & iArr3[3]) - 2) + j3);
        }
    }

    public static final void e(String str, rm1 rm1Var, ki1 ki1Var, fe0 fe0Var, int i2) {
        long j2;
        boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1402584027);
        int i3 = i2 | (go1Var.g(str) ? 4 : 2) | (go1Var.i(rm1Var) ? 32 : 16) | (go1Var.g(ki1Var) ? 256 : 128);
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q2);
            }
            t43 t43Var = (t43) Q2;
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            i13 i13Var = i13.a;
            l13 m2 = o7.m(nq4.k(ki1Var != null ? j42.x(i13Var, ki1Var) : i13Var, 64.0f), l74.a(14.0f));
            if (((Boolean) t43Var.getValue()).booleanValue()) {
                go1Var.d0(736496467);
                go1Var.q(false);
                j2 = k80Var.u;
            } else {
                go1Var.d0(736497682);
                j2 = ((fw2) go1Var.k(i51Var)).a.H;
                go1Var.q(false);
            }
            l13 p2 = mw2.p(m2, j2, mw2.j);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var, (byte) 9);
                go1Var.o0(Q3);
            }
            l13 d2 = r13.d(i42.A0(p2, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, null, null, 261887);
            uw2 c2 = px.c(q8.N, false);
            long j3 = go1Var.T;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            l13 x02 = i42.x0(go1Var, d2);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m3);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x02);
            if (j42.c(str, "⌫")) {
                go1Var.d0(-1228443327);
                ow1.a(a5.F(), "删除", nq4.k(i13Var, 22.0f), ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.v : k80Var.q, go1Var, 432);
                go1Var.q(false);
                z2 = true;
            } else {
                go1Var.d0(-1228157879);
                r55.b(str, null, ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.v : k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.g, go1Var, (i3 & 14) | 1572864, 0, 131002);
                go1Var = go1Var;
                go1Var.q(false);
                z2 = true;
            }
            go1Var.q(z2);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new tf((Object) str, (Object) rm1Var, (Object) ki1Var, i2, (byte) 10);
        }
    }

    public static void e0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (lq2.i0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j4;
                j3 = j4 >> 32;
            }
            long j5 = ((4294967295L & iArr3[2]) - 1) + j3;
            iArr3[2] = (int) j5;
            if ((j5 >> 32) != 0) {
                dq2.z(6, 3, iArr3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        if (r2 == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.dl4 r7, com.github.mytv.dv.model.Author r8, defpackage.ki1 r9, defpackage.rm1 r10, defpackage.fe0 r11, int r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j16.f(dl4, com.github.mytv.dv.model.Author, ki1, rm1, fe0, int):void");
    }

    public static void f0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (jl2.m0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j4;
                long j5 = (j4 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (iArr3[3] & 4294967295L) + 1 + j3;
            iArr3[3] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = j7 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j8;
                long j9 = (j8 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j9;
                j7 = j9 >> 32;
            }
            long j10 = (iArr3[6] & 4294967295L) + 1 + j7;
            iArr3[6] = (int) j10;
            iArr3[7] = (int) (((4294967295L & iArr3[7]) - 1) + (j10 >> 32));
        }
    }

    public static final void g(rm1 rm1Var, ki1 ki1Var, tc0 tc0Var, fe0 fe0Var, int i2) {
        int i3;
        t43 t43Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1888547131);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.i(rm1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(ki1Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.i(tc0Var) ? 256 : 128;
        }
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q2);
            }
            t43 t43Var2 = (t43) Q2;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q3;
            cw4 t02 = p70.t0(((Boolean) t43Var2.getValue()).booleanValue(), x70.f, ((fw2) go1Var.k(lw2.b)).a.u, ((Boolean) ut0.w(t33Var, go1Var).getValue()).booleanValue(), "profile_card_bg", go1Var, 24624, 0);
            tv tvVar = q8.W;
            kp kpVar = new kp(10.0f, true, new y9());
            l13 l13Var = i13.a;
            if (ki1Var != null) {
                l13Var = j42.x(l13Var, ki1Var);
            }
            l13 H2 = p70.H(o7.m(nq4.n(l13Var, 150.0f), jo.d), t02);
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                t43Var = t43Var2;
                Q4 = new xx2(t43Var, (byte) 10);
                go1Var.o0(Q4);
            } else {
                t43Var = t43Var2;
            }
            l13 D0 = i42.D0(r13.d(i42.A0(H2, (tm1) Q4), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), 12.0f, 18.0f);
            ba0 a2 = z90.a(kpVar, tvVar, go1Var, 54);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, D0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x02);
            Object obj = (Boolean) t43Var.getValue();
            obj.getClass();
            tc0Var.invoke(obj, go1Var, Integer.valueOf((i3 >> 3) & 112));
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new ve(rm1Var, ki1Var, tc0Var, i2, (byte) 5);
        }
    }

    public static double g0(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static final void h(final String str, final boolean z2, final boolean z3, fe0 fe0Var, final int i2) {
        int i3;
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1085869272);
        if ((i2 & 6) == 0) {
            i3 = (go1Var2.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var2.h(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var2.h(z3) ? 256 : 128;
        }
        int i4 = i3;
        if (go1Var2.T(i4 & 1, (i4 & 147) != 146)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            long j2 = z3 ? k80Var.s : k80Var.q;
            cw4 s02 = p70.s0(z2, j2, k80Var.v, "profile_card_name", go1Var2, ((i4 >> 3) & 14) | 3072);
            go1Var = go1Var2;
            r55.b(str, p70.G(i13.a, s02, j2, false, null, 12), j2, 0L, z2 ? qk1.P : qk1.O, 0L, new k25(3), 0L, 2, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.h, go1Var, i4 & 14, 24960, 109496);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1() { // from class: iu3
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X2 = mu0.X(i2 | 1);
                    j16.h(str, z2, z3, (fe0) obj, X2);
                    return wd5.a;
                }
            };
        }
    }

    public static final l13 h0(l13 l13Var, boolean z2, pq5 pq5Var, tm1 tm1Var) {
        l13Var.getClass();
        pq5Var.getClass();
        tm1Var.getClass();
        return l13Var.then(new yn5(z2, pq5Var, tm1Var));
    }

    public static final void i(hu2 hu2Var, rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i2) {
        l13 l13Var2;
        Object obj;
        Object n6Var;
        fj0 fj0Var;
        t43 t43Var;
        t43 t43Var2;
        ki1 ki1Var;
        boolean z2;
        boolean z3;
        hu2 hu2Var2;
        t43 t43Var3;
        t43 t43Var4;
        t43 t43Var5;
        int i3;
        Object obj2;
        t43 t43Var6;
        t43 t43Var7;
        boolean z4;
        t43 t43Var8;
        t43 t43Var9;
        hu2 hu2Var3 = hu2Var;
        rm1 rm1Var2 = rm1Var;
        rm1Var2.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1397402960);
        int i4 = i2 | (go1Var.i(hu2Var3) ? 4 : 2) | (go1Var.i(rm1Var2) ? 32 : 16) | RendererCapabilities.DECODER_SUPPORT_MASK;
        if (go1Var.T(i4 & 1, (i4 & 147) != 146)) {
            t43 g2 = wi4.g(hu2Var3.d.h0, go1Var);
            t43 g3 = wi4.g(hu2Var3.y, go1Var);
            t43 g4 = wi4.g(hu2Var3.A, go1Var);
            Object Q2 = go1Var.Q();
            Object obj3 = de0.a;
            fj0 fj0Var2 = null;
            if (Q2 == obj3) {
                Q2 = ad4.w(null);
                go1Var.o0(Q2);
            }
            t43 t43Var10 = (t43) Q2;
            Object Q3 = go1Var.Q();
            if (Q3 == obj3) {
                Q3 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q3);
            }
            t43 t43Var11 = (t43) Q3;
            Object Q4 = go1Var.Q();
            if (Q4 == obj3) {
                Q4 = pt1.r(go1Var);
            }
            ki1 ki1Var2 = (ki1) Q4;
            boolean z5 = ((bw0) go1Var.k(cw0.a)).c == aw0.I;
            int i5 = i4 & 14;
            boolean z6 = i5 == 4 || go1Var.i(hu2Var3);
            Object Q5 = go1Var.Q();
            byte b2 = 6;
            if (z6 || Q5 == obj3) {
                Q5 = new pu1(hu2Var3, fj0Var2, b2);
                go1Var.o0(Q5);
            }
            mw2.h(go1Var, (hn1) Q5, wd5.a);
            Boolean bool = (Boolean) g4.getValue();
            bool.getClass();
            List list = (List) g2.getValue();
            boolean g5 = go1Var.g(g4) | go1Var.g(g2);
            Object Q6 = go1Var.Q();
            if (g5 || Q6 == obj3) {
                obj = obj3;
                fj0Var = null;
                n6Var = new n6((Object) g4, (Object) g2, (Object) ki1Var2, fj0Var, (byte) 12);
                t43Var = g4;
                t43Var2 = g2;
                ki1Var = ki1Var2;
                go1Var.o0(n6Var);
            } else {
                n6Var = Q6;
                obj = obj3;
                ki1Var = ki1Var2;
                t43Var = g4;
                fj0Var = null;
                t43Var2 = g2;
            }
            mw2.i(bool, list, (hn1) n6Var, go1Var);
            ne1 ne1Var = nq4.c;
            i51 i51Var = lw2.b;
            l13 p2 = mw2.p(ne1Var, ((fw2) go1Var.k(i51Var)).a.p, mw2.j);
            uw2 c2 = px.c(q8.N, false);
            long j2 = go1Var.T;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p2);
            xd0.c.getClass();
            go1Var.h0();
            boolean z7 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z7) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m2);
            Integer valueOf = Integer.valueOf(i6);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x02);
            tv tvVar = q8.W;
            i13 i13Var = i13.a;
            l13 C0 = i42.C0(i13Var, 32.0f);
            l13Var2 = i13Var;
            ba0 a2 = z90.a(i42.d, tvVar, go1Var, 48);
            long j3 = go1Var.T;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            l13 x03 = i42.x0(go1Var, C0);
            go1Var.h0();
            ki1 ki1Var3 = ki1Var;
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a2);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(i7, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x03);
            Object obj4 = obj;
            r55.b("谁在看？", null, ((fw2) go1Var.k(i51Var)).a.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.d, go1Var, 1572870, 0, 131002);
            r55.b(z5 ? "← → 选择，OK 进入" : "点按选择要使用的配置", i42.G0(l13Var2, 0.0f, 8.0f, 0.0f, 40.0f, 5), ((fw2) go1Var.k(i51Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.k, go1Var, 48, 0, 131064);
            go1Var = go1Var;
            if (((Boolean) t43Var.getValue()).booleanValue()) {
                go1Var.d0(-701751379);
                kp kpVar = new kp(20.0f, true, new y9());
                i3 = i5;
                boolean g6 = go1Var.g(t43Var2) | go1Var.g(g3) | (i3 == 4 || go1Var.i(hu2Var)) | ((i4 & 112) == 32);
                Object Q7 = go1Var.Q();
                obj2 = obj4;
                if (g6 || Q7 == obj2) {
                    z4 = true;
                    t43Var8 = t43Var11;
                    zt1 zt1Var = new zt1(t43Var2, ki1Var3, hu2Var, rm1Var, g3, t43Var10, t43Var8);
                    t43Var3 = t43Var2;
                    t43Var9 = t43Var10;
                    go1Var.o0(zt1Var);
                    Q7 = zt1Var;
                } else {
                    t43Var3 = t43Var2;
                    z4 = true;
                    t43Var9 = t43Var10;
                    t43Var8 = t43Var11;
                }
                t43Var4 = t43Var9;
                t43Var5 = t43Var8;
                hu2Var2 = hu2Var;
                z3 = z4;
                e21.e(null, null, null, kpVar, null, null, false, null, (tm1) Q7, go1Var, 24576, 495);
                z2 = false;
                go1Var.q(false);
            } else {
                z2 = false;
                z3 = true;
                hu2Var2 = hu2Var;
                t43Var3 = t43Var2;
                t43Var4 = t43Var10;
                t43Var5 = t43Var11;
                i3 = i5;
                obj2 = obj4;
                go1Var.d0(-700597187);
                p70.o(null, null, go1Var, 6, 2);
                go1Var.q(false);
            }
            go1Var.q(z3);
            go1Var.q(z3);
            dl4 dl4Var = (dl4) t43Var4.getValue();
            if (dl4Var == null) {
                go1Var.d0(1089555163);
                go1Var.q(z2);
                rm1Var2 = rm1Var;
                hu2Var3 = hu2Var2;
            } else {
                go1Var.d0(1089555164);
                String str = dl4Var.a;
                Object Q8 = go1Var.Q();
                if (Q8 == obj2) {
                    t43Var6 = t43Var4;
                    Q8 = new sf(t43Var6, (byte) 15);
                    go1Var.o0(Q8);
                } else {
                    t43Var6 = t43Var4;
                }
                rm1 rm1Var3 = (rm1) Q8;
                boolean i8 = go1Var.i(dl4Var) | ((i3 == 4 || go1Var.i(hu2Var2)) ? z3 : z2) | ((i4 & 112) == 32 ? z3 : z2);
                Object Q9 = go1Var.Q();
                if (i8 || Q9 == obj2) {
                    hu2Var3 = hu2Var2;
                    u20 u20Var = new u20((byte) 6, t43Var6, (Object) hu2Var3, (Object) dl4Var, (Object) rm1Var);
                    rm1Var2 = rm1Var;
                    go1Var.o0(u20Var);
                    Q9 = u20Var;
                } else {
                    rm1Var2 = rm1Var;
                    hu2Var3 = hu2Var2;
                }
                d(432, go1Var, rm1Var3, (tm1) Q9, str);
                go1Var.q(z2);
            }
            if (((Boolean) t43Var5.getValue()).booleanValue()) {
                go1Var.d0(1090142087);
                List list2 = (List) t43Var3.getValue();
                ArrayList arrayList = new ArrayList(p70.J(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dl4) it.next()).a);
                }
                Object Q10 = go1Var.Q();
                if (Q10 == obj2) {
                    t43Var7 = t43Var5;
                    Q10 = new sf(t43Var7, (byte) 16);
                    go1Var.o0(Q10);
                } else {
                    t43Var7 = t43Var5;
                }
                rm1 rm1Var4 = (rm1) Q10;
                boolean z8 = (i3 == 4 || go1Var.i(hu2Var3)) ? z3 : z2;
                if ((i4 & 112) != 32) {
                    z3 = z2;
                }
                boolean z9 = z8 | z3;
                Object Q11 = go1Var.Q();
                if (z9 || Q11 == obj2) {
                    Q11 = new m6((Object) hu2Var3, (Object) rm1Var2, (Object) t43Var7, (byte) 17);
                    go1Var.o0(Q11);
                }
                qm4.f(arrayList, rm1Var4, (tm1) Q11, go1Var, 48);
                go1Var.q(z2);
            } else {
                go1Var.d0(1090521682);
                go1Var.q(z2);
            }
        } else {
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new tf((Object) hu2Var3, (Object) rm1Var2, l13Var2, i2, (byte) 9);
        }
    }

    public static final boolean i0(fe0 fe0Var) {
        return ((bw0) ((go1) fe0Var).k(cw0.a)).c == aw0.J;
    }

    public static void j(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j4 >>> 32);
        int i2 = (int) j5;
        iArr3[3] = i2;
        if (((int) (j5 >>> 32)) != 0 || ((i2 >>> 1) >= 2147483646 && jl2.J(iArr3, i0))) {
            l(iArr3);
        }
    }

    public static final boolean j0(dp3 dp3Var) {
        dp3Var.getClass();
        return dp3Var == dp3.L || Build.VERSION.SDK_INT >= 24;
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void l(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        iArr[3] = (int) ((4294967295L & iArr[3]) + 2 + j3);
    }

    public static void m(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = (4294967295L & iArr[2]) + 1 + j3;
        iArr[2] = (int) j5;
        if ((j5 >> 32) != 0) {
            dq2.Y(6, 3, iArr);
        }
    }

    public static void n(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = ((iArr[3] & 4294967295L) - 1) + j3;
        iArr[3] = (int) j6;
        long j7 = j6 >> 32;
        if (j7 != 0) {
            long j8 = j7 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j8;
            long j9 = (j8 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j9;
            j7 = j9 >> 32;
        }
        long j10 = ((iArr[6] & 4294967295L) - 1) + j7;
        iArr[6] = (int) j10;
        iArr[7] = (int) ((4294967295L & iArr[7]) + 1 + (j10 >> 32));
    }

    public static boolean o(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static int p(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d2 > 8.0d ? d3 * d3 * d3 : d2 / 903.2962962962963d;
        double d5 = d3 * d3 * d3;
        boolean z2 = d5 > 0.008856451679035631d;
        double d6 = z2 ? d5 : d2 / 903.2962962962963d;
        if (!z2) {
            d5 = d2 / 903.2962962962963d;
        }
        float[] fArr = q;
        double d7 = d6 * fArr[0];
        double d8 = d4 * fArr[1];
        double d9 = d5 * fArr[2];
        double[][] dArr = s;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((w(d10) & 255) << 16) | (-16777216) | ((w(d11) & 255) << 8) | (w((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void q(defpackage.bw r28, int r29, defpackage.si5 r30, int r31, defpackage.yz r32) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j16.q(bw, int, si5, int, yz):void");
    }

    public static int r(int i2, int i3) {
        if (i3 == 0) {
            s83.t("0 polynomial");
            return 0;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = 32 - numberOfLeadingZeros;
        int i5 = i2 << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i5) >= i4) {
            i5 ^= i3 << ((32 - Integer.numberOfLeadingZeros(i5)) - i4);
        }
        return i5;
    }

    public static double s(double d2) {
        double pow = Math.pow(Math.abs(d2), 0.42d);
        return (((d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static final long t(s04 s04Var, h00 h00Var, int i2, long j2) {
        h00 h00Var2;
        cz czVar = s04Var.J;
        h00Var.getClass();
        long j3 = i2;
        o7.j(h00Var.d(), 0L, j3);
        long j4 = 0;
        if (s04Var.K) {
            zy.i("closed");
            return 0L;
        }
        int i3 = i2;
        h00 h00Var3 = h00Var;
        loop0: while (true) {
            long j5 = j4;
            long a2 = b.a(czVar, h00Var3, j5, j2, i3);
            if (a2 == -1) {
                long j6 = czVar.J;
                long j7 = (j6 - j3) + 1;
                if (j7 >= j2) {
                    break;
                }
                if (j6 >= j2) {
                    int max = (int) Math.max(1L, (j6 - j2) + 1);
                    int min = ((int) Math.min(j3, (czVar.J - j5) + 1)) - 1;
                    if (max > min) {
                        break;
                    }
                    while (true) {
                        h00Var2 = h00Var;
                        if (!czVar.F(min, h00Var2, czVar.J - min)) {
                            if (min == max) {
                                break loop0;
                            }
                            min--;
                        } else {
                            break;
                        }
                    }
                } else {
                    h00Var2 = h00Var;
                }
                if (s04Var.I.read(czVar, 8192L) == -1) {
                    break;
                }
                j4 = Math.max(j5, j7);
                i3 = i2;
                h00Var3 = h00Var2;
            } else {
                return a2;
            }
        }
        return -1L;
    }

    public static long u(s04 s04Var, h00 h00Var, long j2) {
        return t(s04Var, h00Var, h00Var.d(), j2);
    }

    public static final l13 v(l13 l13Var) {
        l13Var.getClass();
        return m05.b(l13Var, wd5.a, km2.R);
    }

    public static int w(double d2) {
        double d3 = d2 / 100.0d;
        int round = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static void x(int i2, int i3, yz yzVar) {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!H(yzVar.k(i5, i3))) {
                throw new os4();
            }
            yzVar.o(i5, i3, 0);
        }
    }

    public static void y(int i2, int i3, yz yzVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = Z[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                yzVar.o(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static void z(int i2, int i3, yz yzVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!H(yzVar.k(i2, i5))) {
                throw new os4();
            }
            yzVar.o(i2, i5, 0);
        }
    }

    public abstract int A();

    public abstract g61 K(int i2);
}
