package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.SystemClock;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.ts.PsExtractor;
import com.github.mytv.dv.model.DanmakuItem;
import com.github.mytv.dv.model.LiveDanmakuMessage;
import com.github.mytv.dv.model.LiveDanmakuSettings;
import com.github.mytv.dv.model.VideoBigThumb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class wx5 {
    public static final l80 A;
    public static final l80 B;
    public static final l80 C;
    public static final l80 D;
    public static final l80 E;
    public static final l80 F;
    public static final l80 G;
    public static final l80 H;
    public static final l80 I;
    public static final l80 J;
    public static final l80 K;
    public static final l80 L;
    public static final l80 M;
    public static final l80 N;
    public static final l80 O;
    public static final l80 P;
    public static final l80 Q;
    public static final l80 R;
    public static final l80 S;
    public static final l80 T;
    public static final l80 U;
    public static final l80 V;
    public static final l80 W;
    public static final l80 X;
    public static final l80 Y;
    public static final l80 Z;
    public static final l80 a0;
    public static final l80 b0;
    public static final do2 c0;
    public static final yc0 d0;
    public static final l80 e0;
    public static final l80 f0;
    public static final int[] g0;
    public static final int[] h0;
    public static final int[] i0;
    public static final int[] j0;
    public static final int[] k0;
    public static final int[] l0;
    public static final long[] m0;
    public static final w11 n0;
    public static final ge o0;
    public static final rs p0;
    public static final byte[] q0;
    public static final tj1 v;
    public static final float x = 30.0f;
    public static final l80 z;
    public static final float[] a = new float[91];
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final tc0 f = new tc0(-1131826196, new bd0((byte) 19), false);
    public static final tc0 g = new tc0(636288403, new yc0(0), false);
    public static final tc0 h = new tc0(-1357803046, new yc0(1), false);
    public static final tc0 i = new tc0(1851954398, new uc0(12), false);
    public static final tc0 j = new tc0(1987928242, new uc0(13), false);
    public static final tc0 k = new tc0(2021957935, new uc0(14), false);
    public static final tc0 l = new tc0(-801340411, new uc0(15), false);
    public static final tc0 m = new tc0(311264417, new uc0(16), false);
    public static final tc0 n = new tc0(-342961609, new uc0(17), false);
    public static final tc0 o = new tc0(-1421857426, new uc0(18), false);
    public static final int[] p = {-19, -1, -1, -1, -1, -1, -1, Log.LOG_LEVEL_OFF};
    public static final int[] q = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final float[] r = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] s = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final float[] t = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] u = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final or0 w = new or0(24);
    public static final int[] y = {13, 15, 14};

    static {
        byte b2 = 2;
        v = new tj1(b2);
        l80 l80Var = l80.P;
        z = l80Var;
        l80 l80Var2 = l80.L;
        A = l80Var2;
        B = l80Var2;
        C = l80Var2;
        D = l80Var2;
        E = l80Var2;
        F = l80Var2;
        l80 l80Var3 = l80.I;
        G = l80Var3;
        H = l80Var2;
        I = l80Var3;
        l80 l80Var4 = l80.M;
        J = l80Var4;
        K = l80Var3;
        L = l80Var3;
        M = l80Var3;
        N = l80Var2;
        O = l80Var;
        P = l80Var4;
        Q = l80Var;
        R = l80Var4;
        S = l80Var4;
        T = l80Var2;
        U = l80Var4;
        V = l80Var4;
        W = l80Var4;
        X = l80Var4;
        Y = l80Var4;
        Z = l80.N;
        a0 = l80Var4;
        b0 = l80Var4;
        c0 = new do2((byte) 27);
        d0 = new yc0(b2);
        e0 = l80Var;
        f0 = l80.R;
        g0 = new int[]{-4553, -2, -1, -1, -1, -1};
        h0 = new int[]{20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
        i0 = new int[]{-20729809, -9107, -2, -1, -1, -1, 9105, 2};
        j0 = new int[]{-977, -2, -1, -1, -1, -1, -1, -1};
        k0 = new int[]{954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
        l0 = new int[]{-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};
        m0 = new long[]{2791191049453778211L, 2791191049453778402L, 6};
        n0 = new w11();
        o0 = new ge(AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
        p0 = new rs(0, 0);
        q0 = new byte[0];
    }

    public static void A(int[] iArr, int[] iArr2) {
        long j2 = iArr[8] & 4294967295L;
        long j3 = (977 * j2) + (iArr[0] & 4294967295L);
        int i2 = (int) j3;
        iArr2[0] = i2;
        long j4 = iArr[9] & 4294967295L;
        long j5 = (977 * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i3 = (int) j5;
        iArr2[1] = i3;
        long j6 = iArr[10] & 4294967295L;
        long j7 = (977 * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i4 = (int) j7;
        iArr2[2] = i4;
        long j8 = iArr[11] & 4294967295L;
        long j9 = (977 * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i5 = (int) j9;
        iArr2[3] = i5;
        long j10 = iArr[12] & 4294967295L;
        long j11 = (977 * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[13] & 4294967295L;
        long j13 = (977 * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = iArr[14] & 4294967295L;
        long j15 = (977 * j14) + j12 + (iArr[6] & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = iArr[15] & 4294967295L;
        long j17 = (977 * j16) + j14 + (iArr[7] & 4294967295L) + (j15 >>> 32);
        iArr2[7] = (int) j17;
        long j18 = (j17 >>> 32) + j16;
        long j19 = j18 & 4294967295L;
        long j20 = (977 * j19) + (i2 & 4294967295L);
        iArr2[0] = (int) j20;
        long j21 = j18 >>> 32;
        long j22 = (977 * j21) + j19 + (i3 & 4294967295L) + (j20 >>> 32);
        iArr2[1] = (int) j22;
        long j23 = j21 + (i4 & 4294967295L) + (j22 >>> 32);
        iArr2[2] = (int) j23;
        long j24 = (j23 >>> 32) + (i5 & 4294967295L);
        iArr2[3] = (int) j24;
        if (((j24 >>> 32) == 0 ? 0 : dq2.Z(8, 4, iArr2)) != 0 || (iArr2[7] == -1 && jl2.K(iArr2, j0))) {
            dq2.c(8, 977, iArr2);
        }
    }

    public static void B(int i2, int[] iArr) {
        int i3 = iArr[7];
        int i4 = (i2 << 1) | (i3 >>> 31);
        iArr[7] = dq2.i(7, i4 * 19, iArr) + (i3 & Log.LOG_LEVEL_OFF);
        if (jl2.K(iArr, p)) {
            P(iArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (((r1 >>> 32) != 0 ? defpackage.dq2.Z(6, 3, r12) : 0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void C(int r11, int[] r12) {
        /*
            r0 = 6
            if (r11 == 0) goto L3c
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 4553(0x11c9, double:2.2495E-320)
            long r5 = r5 * r1
            r11 = 0
            r7 = r12[r11]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r5 = r5 + r7
            int r7 = (int) r5
            r12[r11] = r7
            r7 = 32
            long r5 = r5 >>> r7
            r8 = 1
            r9 = r12[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r1 = r1 + r9
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r8] = r5
            long r1 = r1 >>> r7
            r5 = 2
            r6 = r12[r5]
            long r8 = (long) r6
            long r3 = r3 & r8
            long r1 = r1 + r3
            int r3 = (int) r1
            r12[r5] = r3
            long r1 = r1 >>> r7
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L35
            goto L3a
        L35:
            r11 = 3
            int r11 = defpackage.dq2.Z(r0, r11, r12)
        L3a:
            if (r11 != 0) goto L4a
        L3c:
            r11 = 5
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L4f
            int[] r11 = defpackage.wx5.g0
            boolean r11 = defpackage.lq2.M(r12, r11)
            if (r11 == 0) goto L4f
        L4a:
            r11 = 4553(0x11c9, float:6.38E-42)
            defpackage.dq2.c(r0, r11, r12)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx5.C(int, int[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (((r1 >>> 32) != 0 ? defpackage.dq2.Z(8, 3, r12) : 0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D(int r11, int[] r12) {
        /*
            r0 = 8
            if (r11 == 0) goto L3d
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 977(0x3d1, double:4.827E-321)
            long r5 = r5 * r1
            r11 = 0
            r7 = r12[r11]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r5 = r5 + r7
            int r7 = (int) r5
            r12[r11] = r7
            r7 = 32
            long r5 = r5 >>> r7
            r8 = 1
            r9 = r12[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r1 = r1 + r9
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r8] = r5
            long r1 = r1 >>> r7
            r5 = 2
            r6 = r12[r5]
            long r8 = (long) r6
            long r3 = r3 & r8
            long r1 = r1 + r3
            int r3 = (int) r1
            r12[r5] = r3
            long r1 = r1 >>> r7
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L36
            goto L3b
        L36:
            r11 = 3
            int r11 = defpackage.dq2.Z(r0, r11, r12)
        L3b:
            if (r11 != 0) goto L4b
        L3d:
            r11 = 7
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L50
            int[] r11 = defpackage.wx5.j0
            boolean r11 = defpackage.jl2.K(r12, r11)
            if (r11 == 0) goto L50
        L4b:
            r11 = 977(0x3d1, float:1.369E-42)
            defpackage.dq2.c(r0, r11, r12)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx5.D(int, int[]):void");
    }

    public static final sb4 E(fe0 fe0Var) {
        Object[] objArr = new Object[0];
        boolean e2 = ((go1) fe0Var).e(0);
        go1 go1Var = (go1) fe0Var;
        Object Q2 = go1Var.Q();
        if (e2 || Q2 == de0.a) {
            Q2 = new wd3((byte) 14);
            go1Var.o0(Q2);
        }
        return (sb4) ut0.O(objArr, sb4.k, (rm1) Q2, go1Var, 0);
    }

    public static final lu4 F(VideoBigThumb videoBigThumb, long j2, long j3, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(-1061041506);
        if (videoBigThumb == null || !videoBigThumb.isRenderable() || j3 <= 0) {
            go1Var.q(false);
            return null;
        }
        Context context = (Context) go1Var.k(rb.b);
        int imgYLen = videoBigThumb.getImgYLen() * videoBigThumb.getImgXLen();
        int size = videoBigThumb.getImgUrls().size() * imgYLen;
        int imgNum = videoBigThumb.getImgNum();
        if (size > imgNum) {
            size = imgNum;
        }
        if (size <= 0) {
            go1Var.q(false);
            return null;
        }
        long imgNum2 = videoBigThumb.getImgNum();
        if (j2 < 0) {
            j2 = 0;
        }
        boolean z2 = true;
        int r2 = ut0.r((int) ((imgNum2 * j2) / j3), 0, size - 1);
        int r3 = ut0.r(r2 / imgYLen, 0, p70.X(videoBigThumb.getImgUrls()));
        String str = videoBigThumb.getImgUrls().get(r3);
        int i3 = r2 - (r3 * imgYLen);
        if ((((i2 & 14) ^ 6) <= 4 || !go1Var.g(videoBigThumb)) && (i2 & 6) != 4) {
            z2 = false;
        }
        Object Q2 = go1Var.Q();
        Object obj = de0.a;
        if (z2 || Q2 == obj) {
            Q2 = ad4.w(null);
            go1Var.o0(Q2);
        }
        t43 t43Var = (t43) Q2;
        boolean g2 = go1Var.g(t43Var) | go1Var.i(context) | go1Var.g(str);
        Object Q3 = go1Var.Q();
        if (g2 || Q3 == obj) {
            Q3 = new ah4(t43Var, context, str, null);
            go1Var.o0(Q3);
        }
        mw2.h(go1Var, (hn1) Q3, str);
        Bitmap bitmap = (Bitmap) t43Var.getValue();
        if (bitmap == null) {
            go1Var.q(false);
            return null;
        }
        boolean g3 = go1Var.g(bitmap);
        Object Q4 = go1Var.Q();
        if (g3 || Q4 == obj) {
            Q4 = new dd(bitmap);
            go1Var.o0(Q4);
        }
        tw1 tw1Var = (tw1) Q4;
        int imgXSize = videoBigThumb.getImgXSize();
        Integer valueOf = Integer.valueOf(imgXSize);
        if (imgXSize <= 0 || videoBigThumb.getImgXLen() * imgXSize > bitmap.getWidth()) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : bitmap.getWidth() / videoBigThumb.getImgXLen();
        int imgYSize = videoBigThumb.getImgYSize();
        Integer valueOf2 = Integer.valueOf(imgYSize);
        if (imgYSize <= 0 || videoBigThumb.getImgYLen() * imgYSize > bitmap.getHeight()) {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : bitmap.getHeight() / videoBigThumb.getImgYLen();
        if (intValue <= 0 || intValue2 <= 0) {
            go1Var.q(false);
            return null;
        }
        lu4 lu4Var = new lu4(tw1Var, (Float.floatToRawIntBits((i3 % videoBigThumb.getImgXLen()) * intValue) << 32) | (Float.floatToRawIntBits((i3 / videoBigThumb.getImgXLen()) * intValue2) & 4294967295L), (Float.floatToRawIntBits(intValue) << 32) | (Float.floatToRawIntBits(intValue2) & 4294967295L));
        go1Var.q(false);
        return lu4Var;
    }

    public static l13 G(l13 l13Var, sb4 sb4Var, boolean z2) {
        pg3 pg3Var = pg3.I;
        pg3 pg3Var2 = z2 ? pg3Var : pg3.J;
        t33 t33Var = sb4Var.e;
        i13 i13Var = i13.a;
        return l13Var.then(pg3Var2 == pg3Var ? o7.m(i13Var, aj5.b) : o7.m(i13Var, jv1.a)).then(new tb4(null, null, null, t33Var, pg3Var2, sb4Var, true, true)).then(new ic4(sb4Var, z2));
    }

    public static final l13 H(n45 n45Var) {
        return new y25(n45Var);
    }

    public static void I(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        jl2.j0(iArr, iArr3);
        x(iArr3, iArr2);
    }

    public static void J(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        lq2.g0(iArr, iArr3);
        z(iArr3, iArr2);
    }

    public static void K(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        jl2.j0(iArr, iArr3);
        while (true) {
            x(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                jl2.j0(iArr2, iArr3);
            }
        }
    }

    public static void L(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        jl2.j0(iArr, iArr3);
        while (true) {
            A(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                jl2.j0(iArr2, iArr3);
            }
        }
    }

    public static void M(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[5];
        m(jArr, jArr3);
        while (true) {
            y(jArr3, jArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                m(jArr2, jArr3);
            }
        }
    }

    public static void N(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        lq2.g0(iArr, iArr3);
        while (true) {
            z(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                lq2.g0(iArr2, iArr3);
            }
        }
    }

    public static final l13 O(boolean z2, boolean z3, rm1 rm1Var) {
        l13 l13Var = i13.a;
        if (!z2 || !jy4.a) {
            return l13Var;
        }
        if (z3) {
            l13Var = new ky4(n0);
        }
        return l13Var.then(new hy4(rm1Var));
    }

    public static void P(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            j3 = dq2.Y(7, 1, iArr);
        }
        iArr[7] = (int) (((4294967295L & iArr[7]) - 2147483648L) + j3);
    }

    public static void Q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (jl2.m0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 19;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                j3 = dq2.z(7, 1, iArr3);
            }
            iArr3[7] = (int) ((4294967295L & iArr3[7]) + 2147483648L + j3);
        }
    }

    public static void R(int[] iArr, int[] iArr2, int[] iArr3) {
        if (lq2.i0(iArr, iArr2, iArr3) != 0) {
            dq2.D0(6, 4553, iArr3);
        }
    }

    public static void S(int[] iArr, int[] iArr2, int[] iArr3) {
        if (jl2.m0(iArr, iArr2, iArr3) != 0) {
            dq2.D0(8, 977, iArr3);
        }
    }

    public static void T(int[] iArr, int[] iArr2) {
        dq2.x0(8, 0, iArr, iArr2);
        if (jl2.K(iArr2, p)) {
            P(iArr2);
        }
    }

    public static final List U(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return o91.I;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            qe2 qe2Var = (qe2) arrayList.get(i4);
            int index = qe2Var.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList2.add(qe2Var);
            }
        }
        t70.H0(v, arrayList2);
        return arrayList2;
    }

    public static final void V(int i2, int i3, int i4) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder D2 = hf1.D("OffsetMapping.originalToTransformed returned invalid mapping: ", i4, " -> ", i2, " is not in range of transformed text [0, ");
        D2.append(i3);
        D2.append("]");
        t02.c(D2.toString());
    }

    public static final void W(int i2, int i3, int i4) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder D2 = hf1.D("OffsetMapping.transformedToOriginal returned invalid mapping: ", i4, " -> ", i2, " is not in range of original text [0, ");
        D2.append(i3);
        D2.append("]");
        t02.c(D2.toString());
    }

    public static l13 X(l13 l13Var, sb4 sb4Var) {
        return G(l13Var, sb4Var, true);
    }

    public static final l13 Y(l13 l13Var) {
        return l13Var.then(new f42());
    }

    public static float Z() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void a(final List list, final float f2, final float f3, final hv4 hv4Var, final l13 l13Var, fe0 fe0Var, final int i2) {
        x04 u2;
        hn1 hn1Var;
        float f4;
        boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1269001805);
        int i3 = i2 | (go1Var.g(list) ? 4 : 2) | (go1Var.d(f2) ? 32 : 16) | (go1Var.d(f3) ? 256 : 128) | (go1Var.g(hv4Var) ? 2048 : 1024) | (go1Var.g(l13Var) ? 16384 : 8192);
        if (go1Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z3 = (i3 & 14) == 4;
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (z3 || Q2 == jpVar) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!jx4.L(jx4.g0(((LiveDanmakuMessage) obj).getContent()).toString())) {
                        arrayList.add(obj);
                    }
                }
                Q2 = o70.m1(50, arrayList);
                go1Var.o0(Q2);
            }
            final List list2 = (List) Q2;
            if (list2.isEmpty()) {
                u2 = go1Var.u();
                if (u2 != null) {
                    final byte b2 = 1;
                    hn1Var = new hn1(list, f2, f3, hv4Var, l13Var, i2, b2) { // from class: tm2
                        public final /* synthetic */ byte I;
                        public final /* synthetic */ List J;
                        public final /* synthetic */ float K;
                        public final /* synthetic */ float L;
                        public final /* synthetic */ hv4 M;
                        public final /* synthetic */ l13 N;

                        {
                            this.I = b2;
                        }

                        @Override // defpackage.hn1
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b3 = this.I;
                            wd5 wd5Var = wd5.a;
                            switch (b3) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int X2 = mu0.X(1);
                                    wx5.a(this.J, this.K, this.L, this.M, this.N, (fe0) obj2, X2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int X3 = mu0.X(1);
                                    wx5.a(this.J, this.K, this.L, this.M, this.N, (fe0) obj2, X3);
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    u2.d = hn1Var;
                }
                return;
            }
            Configuration configuration = (Configuration) go1Var.k(rb.a);
            bw0 bw0Var = (bw0) go1Var.k(cw0.a);
            float f5 = ((r11) go1Var.k(r13.a)).I;
            WeakHashMap weakHashMap = dw5.w;
            float d02 = i42.d0(j42.d(wi4.h(go1Var).e, go1Var), (da2) go1Var.k(hf0.n));
            i51 i51Var = lw2.b;
            final long j2 = ((fw2) go1Var.k(i51Var)).a.a;
            final long j3 = ((fw2) go1Var.k(i51Var)).a.q;
            final ag2 a2 = bg2.a(go1Var);
            LiveDanmakuMessage liveDanmakuMessage = (LiveDanmakuMessage) o70.b1(list2);
            Long valueOf = liveDanmakuMessage != null ? Long.valueOf(liveDanmakuMessage.getMessageId()) : null;
            boolean i4 = go1Var.i(list2) | go1Var.g(a2);
            Object Q3 = go1Var.Q();
            if (i4 || Q3 == jpVar) {
                f4 = d02;
                Q3 = new r((Object) list2, (Object) a2, (fj0) null, (byte) 25);
                go1Var.o0(Q3);
            } else {
                f4 = d02;
            }
            mw2.h(go1Var, (hn1) Q3, valueOf);
            long j4 = oh4.j(13);
            float q2 = ut0.q(f3, 0.6923077f, 1.6923077f);
            oh4.d(j4);
            final long p2 = oh4.p(j4 & 1095216660480L, p65.c(j4) * q2);
            final boolean z4 = hv4Var == null;
            tc0 u0 = p70.u0(1147949216, new hn1() { // from class: xm2
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    fe0 fe0Var2 = (fe0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.T(intValue & 1, (intValue & 3) != 2)) {
                        l13 e2 = nq4.e(i13.a, 1.0f);
                        final List list3 = list2;
                        boolean i5 = go1Var2.i(list3);
                        final long j5 = j2;
                        boolean f6 = i5 | go1Var2.f(j5);
                        final boolean z5 = z4;
                        boolean h2 = f6 | go1Var2.h(z5);
                        final long j6 = j3;
                        boolean f7 = h2 | go1Var2.f(j6);
                        final long j7 = p2;
                        boolean f8 = f7 | go1Var2.f(j7);
                        Object Q4 = go1Var2.Q();
                        if (f8 || Q4 == de0.a) {
                            tm1 tm1Var = new tm1() { // from class: um2
                                @Override // defpackage.tm1
                                public final Object invoke(Object obj4) {
                                    of2 of2Var = (of2) obj4;
                                    of2Var.getClass();
                                    c22 c22Var = new c22((byte) 23);
                                    c22 c22Var2 = new c22((byte) 24);
                                    List list4 = list3;
                                    of2Var.a0(list4.size(), new ee(c22Var, list4, (byte) 13), new ee(c22Var2, list4, (byte) 14), new tc0(802480018, new ym2(list4, j5, z5, j6, j7), true));
                                    return wd5.a;
                                }
                            };
                            go1Var2.o0(tm1Var);
                            Q4 = tm1Var;
                        }
                        e21.c(e2, ag2.this, null, null, null, null, false, null, (tm1) Q4, go1Var2, 6, 508);
                    } else {
                        go1Var2.W();
                    }
                    return wd5.a;
                }
            }, go1Var);
            l13 then = l13Var.then(nq4.c);
            vv vvVar = q8.J;
            uw2 c2 = px.c(vvVar, false);
            long j5 = go1Var.T;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, then);
            xd0.c.getClass();
            go1Var.h0();
            boolean z5 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z5) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m2);
            Integer valueOf2 = Integer.valueOf(i5);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf2);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            i13 i13Var = i13.a;
            if (hv4Var != null) {
                go1Var.d0(1019208551);
                l13 E0 = i42.E0(j42.I(i13Var, new vk5(hv4Var, f5)), 16.0f, 0.0f, 2);
                uw2 c3 = px.c(vvVar, false);
                long j6 = go1Var.T;
                int i6 = (int) (j6 ^ (j6 >>> 32));
                am3 m3 = go1Var.m();
                l13 x02 = i42.x0(go1Var, E0);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, c3);
                qi4.k(go1Var, sgVar2, m3);
                r7.G(i6, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x02);
                u0.invoke(go1Var, 6);
                go1Var.q(true);
                go1Var.q(false);
                z2 = true;
            } else {
                go1Var.d0(1019509158);
                aw0 aw0Var = bw0Var.c;
                boolean z6 = bw0Var.f;
                float f6 = (aw0Var != aw0.I || z6) ? 12.0f : 40.0f;
                l13 D0 = i42.D0(mw2.p(o7.m(nq4.i(nq4.p(i42.G0(ux.a.align(i13Var, q8.P), f6 + f4, 0.0f, 0.0f, f6 + f5, 6), 0.0f, configuration.screenWidthDp * (z6 ? 0.62f : 0.33333334f), 1), 0.0f, configuration.screenHeightDp / 3.0f, 1), hx2.j), x70.c(x70.b, ut0.q(0.4f * f2, 0.1f, 0.6f)), mw2.j), 12.0f, 8.0f);
                uw2 c4 = px.c(vvVar, false);
                long j7 = go1Var.T;
                int i7 = (int) (j7 ^ (j7 >>> 32));
                am3 m4 = go1Var.m();
                l13 x03 = i42.x0(go1Var, D0);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, c4);
                qi4.k(go1Var, sgVar2, m4);
                r7.G(i7, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x03);
                u0.invoke(go1Var, 6);
                z2 = true;
                go1Var.q(true);
                go1Var.q(false);
            }
            go1Var.q(z2);
        } else {
            go1Var.W();
        }
        u2 = go1Var.u();
        if (u2 != null) {
            final byte b3 = 0;
            hn1Var = new hn1(list, f2, f3, hv4Var, l13Var, i2, b3) { // from class: tm2
                public final /* synthetic */ byte I;
                public final /* synthetic */ List J;
                public final /* synthetic */ float K;
                public final /* synthetic */ float L;
                public final /* synthetic */ hv4 M;
                public final /* synthetic */ l13 N;

                {
                    this.I = b3;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    byte b32 = this.I;
                    wd5 wd5Var = wd5.a;
                    switch (b32) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int X2 = mu0.X(1);
                            wx5.a(this.J, this.K, this.L, this.M, this.N, (fe0) obj2, X2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int X3 = mu0.X(1);
                            wx5.a(this.J, this.K, this.L, this.M, this.N, (fe0) obj2, X3);
                            break;
                    }
                    return wd5Var;
                }
            };
            u2.d = hn1Var;
        }
    }

    public static final void b(final op2 op2Var, final String str, final l13 l13Var, hv4 hv4Var, final x70 x70Var, boolean z2, boolean z3, boolean z4, fe0 fe0Var, final int i2, final int i3) {
        hv4 hv4Var2;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        char c2;
        final boolean z8;
        final hv4 hv4Var3;
        final boolean z9;
        final boolean z10;
        x04 u2;
        hn1 hn1Var;
        Object[] objArr;
        final t43 t43Var;
        l13 l13Var2;
        op2Var.getClass();
        str.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1375056556);
        int i7 = i2 | (go1Var.i(op2Var) ? 4 : 2) | (go1Var.g(str) ? 32 : 16);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = i7 | 3072;
            hv4Var2 = hv4Var;
        } else {
            hv4Var2 = hv4Var;
            i4 = i7 | (go1Var.g(hv4Var2) ? 2048 : 1024);
        }
        int i9 = i4 | (go1Var.g(x70Var) ? 16384 : 8192);
        int i10 = i3 & 32;
        if (i10 != 0) {
            i5 = i9 | 196608;
            z5 = z2;
        } else {
            z5 = z2;
            i5 = i9 | (go1Var.h(z5) ? 131072 : 65536);
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i6 = i5 | 1572864;
            z6 = z3;
        } else {
            z6 = z3;
            i6 = i5 | (go1Var.h(z6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i12 = i3 & 128;
        if (i12 != 0) {
            i6 |= 12582912;
            z7 = z4;
            c2 = 2;
        } else {
            z7 = z4;
            c2 = 2;
            if ((i2 & 12582912) == 0) {
                i6 |= go1Var.h(z7) ? 8388608 : 4194304;
            }
        }
        int i13 = i6 & 4793491;
        int i14 = i6;
        byte b2 = 0;
        if (go1Var.T(i14 & 1, i13 != 4793490)) {
            final hv4 hv4Var4 = i8 != 0 ? null : hv4Var2;
            final boolean z11 = i10 != 0 ? false : z5;
            final boolean z12 = i11 != 0 ? false : z6;
            final boolean z13 = i12 != 0 ? false : z7;
            t43 g2 = wi4.g(op2Var.A, go1Var);
            final t43 g3 = wi4.g(op2Var.y, go1Var);
            if (!((LiveDanmakuSettings) g2.getValue()).getEnabled()) {
                u2 = go1Var.u();
                if (u2 == null) {
                    return;
                }
                final byte b3 = 0;
                hn1Var = new hn1() { // from class: sm2
                    @Override // defpackage.hn1
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b3;
                        wd5 wd5Var = wd5.a;
                        int i15 = i2;
                        switch (b4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int X2 = mu0.X(i15 | 1);
                                wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X2, i3);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int X3 = mu0.X(i15 | 1);
                                wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X3, i3);
                                break;
                            case 2:
                                ((Integer) obj2).getClass();
                                int X4 = mu0.X(i15 | 1);
                                wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X4, i3);
                                break;
                            case 3:
                                ((Integer) obj2).getClass();
                                int X5 = mu0.X(i15 | 1);
                                wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X5, i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int X6 = mu0.X(i15 | 1);
                                wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X6, i3);
                                break;
                        }
                        return wd5Var;
                    }
                };
            } else if (((LiveDanmakuSettings) g2.getValue()).getStyle() == an2.L) {
                go1Var.d0(1088828555);
                if (z12) {
                    go1Var.q(false);
                    u2 = go1Var.u();
                    if (u2 == null) {
                        return;
                    }
                    final byte b4 = 1;
                    hn1Var = new hn1() { // from class: sm2
                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b42 = b4;
                            wd5 wd5Var = wd5.a;
                            int i15 = i2;
                            switch (b42) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int X2 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X2, i3);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int X3 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X3, i3);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    int X4 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X4, i3);
                                    break;
                                case 3:
                                    ((Integer) obj2).getClass();
                                    int X5 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X5, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int X6 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X6, i3);
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                } else {
                    final boolean z14 = z12;
                    final boolean z15 = z13;
                    final boolean z16 = z11;
                    xh0.a(x70Var, ma4.M, p70.u0(938313733, new qo2(hv4Var4, l13Var, g3, g2, z16), go1Var), go1Var, ((i14 >> 12) & 14) | 432);
                    go1Var.q(false);
                    u2 = go1Var.u();
                    if (u2 == null) {
                        return;
                    }
                    final byte b5 = 2;
                    hn1Var = new hn1() { // from class: sm2
                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b42 = b5;
                            wd5 wd5Var = wd5.a;
                            int i15 = i2;
                            switch (b42) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int X2 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z16, z14, z15, (fe0) obj, X2, i3);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int X3 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z16, z14, z15, (fe0) obj, X3, i3);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    int X4 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z16, z14, z15, (fe0) obj, X4, i3);
                                    break;
                                case 3:
                                    ((Integer) obj2).getClass();
                                    int X5 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z16, z14, z15, (fe0) obj, X5, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int X6 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z16, z14, z15, (fe0) obj, X6, i3);
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                }
            } else {
                go1Var.d0(1089231214);
                go1Var.q(false);
                if (z13) {
                    u2 = go1Var.u();
                    if (u2 == null) {
                        return;
                    }
                    final byte b6 = 3;
                    hn1Var = new hn1() { // from class: sm2
                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b42 = b6;
                            wd5 wd5Var = wd5.a;
                            int i15 = i2;
                            switch (b42) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int X2 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X2, i3);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int X3 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X3, i3);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    int X4 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X4, i3);
                                    break;
                                case 3:
                                    ((Integer) obj2).getClass();
                                    int X5 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X5, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int X6 = mu0.X(i15 | 1);
                                    wx5.b(op2Var, str, l13Var, hv4Var4, x70Var, z11, z12, z13, (fe0) obj, X6, i3);
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                } else {
                    hv4 hv4Var5 = hv4Var4;
                    boolean z17 = z11;
                    boolean z18 = z12;
                    boolean z19 = z13;
                    int i15 = i14 & 112;
                    boolean z20 = i15 == 32;
                    Object Q2 = go1Var.Q();
                    Object obj = de0.a;
                    if (z20 || Q2 == obj) {
                        Q2 = Long.valueOf(SystemClock.elapsedRealtime());
                        go1Var.o0(Q2);
                    }
                    final long longValue = ((Number) Q2).longValue();
                    boolean z21 = i15 == 32;
                    Object Q3 = go1Var.Q();
                    if (z21 || Q3 == obj) {
                        Q3 = new bn2();
                        go1Var.o0(Q3);
                    }
                    final bn2 bn2Var = (bn2) Q3;
                    boolean z22 = i15 == 32;
                    Object Q4 = go1Var.Q();
                    if (z22 || Q4 == obj) {
                        Q4 = ad4.w(o91.I);
                        go1Var.o0(Q4);
                    }
                    final t43 t43Var2 = (t43) Q4;
                    boolean f2 = go1Var.f(longValue);
                    Object Q5 = go1Var.Q();
                    if (f2 || Q5 == obj) {
                        Q5 = new vm2(longValue, b2);
                        go1Var.o0(Q5);
                    }
                    rm1 rm1Var = (rm1) Q5;
                    List list = (List) g3.getValue();
                    Boolean valueOf = Boolean.valueOf(((LiveDanmakuSettings) g2.getValue()).getBlockEnabled());
                    List<String> blockWords = ((LiveDanmakuSettings) g2.getValue()).getBlockWords();
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = bn2Var;
                    objArr2[1] = list;
                    objArr2[c2] = valueOf;
                    objArr2[3] = blockWords;
                    boolean g4 = go1Var.g(t43Var2) | go1Var.i(bn2Var) | go1Var.g(g3) | go1Var.f(longValue) | go1Var.g(g2);
                    Object Q6 = go1Var.Q();
                    if (g4 || Q6 == obj) {
                        objArr = objArr2;
                        t43Var = g2;
                        rm1 rm1Var2 = new rm1() { // from class: wm2
                            @Override // defpackage.rm1
                            public final Object invoke() {
                                List list2;
                                List<String> list3;
                                boolean z23;
                                String str2;
                                long max;
                                List<LiveDanmakuMessage> list4 = (List) g3.getValue();
                                long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
                                t43 t43Var3 = t43Var;
                                boolean blockEnabled = ((LiveDanmakuSettings) t43Var3.getValue()).getBlockEnabled();
                                List<String> blockWords2 = ((LiveDanmakuSettings) t43Var3.getValue()).getBlockWords();
                                bn2 bn2Var2 = bn2.this;
                                HashMap hashMap = bn2Var2.a;
                                list4.getClass();
                                blockWords2.getClass();
                                if (list4.equals(bn2Var2.c) && blockEnabled == bn2Var2.d && blockWords2.equals(bn2Var2.e)) {
                                    list2 = bn2Var2.b;
                                } else {
                                    int J2 = sv2.J(p70.J(list4, 10));
                                    if (J2 < 16) {
                                        J2 = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(J2);
                                    for (Object obj2 : list4) {
                                        linkedHashMap.put(Long.valueOf(((LiveDanmakuMessage) obj2).getMessageId()), obj2);
                                    }
                                    List list5 = bn2Var2.b;
                                    int J3 = sv2.J(p70.J(list5, 10));
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(J3 >= 16 ? J3 : 16);
                                    for (Object obj3 : list5) {
                                        linkedHashMap2.put(((DanmakuItem) obj3).getDanmakuId(), obj3);
                                    }
                                    List list6 = bn2Var2.b;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list6.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        DanmakuItem danmakuItem = (DanmakuItem) next;
                                        Long B2 = qx4.B(jx4.S(danmakuItem.getDanmakuId(), "live_"));
                                        Iterator it2 = it;
                                        if (j42.c(linkedHashMap.get(B2), hashMap.get(B2)) && linkedHashMap.containsKey(B2) && !bn2.a(danmakuItem.getText(), blockWords2, blockEnabled)) {
                                            arrayList.add(next);
                                        }
                                        it = it2;
                                    }
                                    hashMap.keySet().retainAll(linkedHashMap.keySet());
                                    DanmakuItem danmakuItem2 = (DanmakuItem) o70.b1(arrayList);
                                    long offsetTime = danmakuItem2 != null ? danmakuItem2.getOffsetTime() : elapsedRealtime - 150;
                                    for (LiveDanmakuMessage liveDanmakuMessage : list4) {
                                        if (!j42.c(hashMap.get(Long.valueOf(liveDanmakuMessage.getMessageId())), liveDanmakuMessage)) {
                                            hashMap.put(Long.valueOf(liveDanmakuMessage.getMessageId()), liveDanmakuMessage);
                                            String obj4 = jx4.g0(liveDanmakuMessage.getContent()).toString();
                                            if (!jx4.L(obj4) && !bn2.a(obj4, blockWords2, blockEnabled)) {
                                                list3 = blockWords2;
                                                z23 = blockEnabled;
                                                String A2 = r7.A("live_", liveDanmakuMessage.getMessageId());
                                                DanmakuItem danmakuItem3 = (DanmakuItem) linkedHashMap2.get(A2);
                                                if (danmakuItem3 != null) {
                                                    str2 = A2;
                                                    max = danmakuItem3.getOffsetTime();
                                                } else {
                                                    str2 = A2;
                                                    max = Math.max(elapsedRealtime, offsetTime + 150);
                                                }
                                                offsetTime = Math.max(offsetTime, max);
                                                arrayList.add(new DanmakuItem(str2, "live", liveDanmakuMessage.getUserId(), max, obj4, 1, 0, 0.0d, 0, 0, false, false, false, 0, false, 0, false, 65472, (er0) null));
                                                blockEnabled = z23;
                                                blockWords2 = list3;
                                            }
                                        }
                                        list3 = blockWords2;
                                        z23 = blockEnabled;
                                        blockEnabled = z23;
                                        blockWords2 = list3;
                                    }
                                    List m1 = o70.m1(PsExtractor.VIDEO_STREAM_MASK, o70.k1(arrayList, new xi1((byte) 10)));
                                    bn2Var2.b = m1;
                                    bn2Var2.c = list4;
                                    bn2Var2.d = blockEnabled;
                                    bn2Var2.e = blockWords2;
                                    list2 = m1;
                                }
                                t43Var2.setValue(list2);
                                return wd5.a;
                            }
                        };
                        go1Var.o0(rm1Var2);
                        Q6 = rm1Var2;
                    } else {
                        objArr = objArr2;
                        t43Var = g2;
                    }
                    rm1 rm1Var3 = (rm1) Q6;
                    boolean e2 = go1Var.e(4);
                    for (int i16 = 0; i16 < 4; i16++) {
                        e2 |= go1Var.g(objArr[i16]);
                    }
                    if (e2) {
                        mw2.L(go1Var, rm1Var3);
                    }
                    if (hv4Var5 != null) {
                        f80 f80Var = p9.a;
                        l13Var2 = new iv4(hv4Var5);
                    } else {
                        l13Var2 = nq4.c;
                    }
                    l13 n2 = o7.n(l13Var.then(l13Var2));
                    vv vvVar = q8.J;
                    uw2 c3 = px.c(vvVar, false);
                    long j2 = go1Var.T;
                    int i17 = (int) (j2 ^ (j2 >>> 32));
                    am3 m2 = go1Var.m();
                    l13 x0 = i42.x0(go1Var, n2);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(wa2.A0);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, c3);
                    qi4.k(go1Var, q8.b0, m2);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i17));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    t43 t43Var3 = t43Var;
                    i42.I((List) t43Var2.getValue(), rm1Var, true, i42.G0(ux.a.align(nq4.b(nq4.e(i13.a, 1.0f), ((LiveDanmakuSettings) t43Var3.getValue()).getDisplayArea()), vvVar), 16.0f, 16.0f, 16.0f, 0.0f, 8), ((LiveDanmakuSettings) t43Var.getValue()).getEnabled(), ((LiveDanmakuSettings) t43Var.getValue()).getOpacity(), 1.0f, ((LiveDanmakuSettings) t43Var.getValue()).getFontSize(), ((LiveDanmakuSettings) t43Var.getValue()).getSpeed(), ((LiveDanmakuSettings) t43Var.getValue()).getVerticalSpacingScale(), ((LiveDanmakuSettings) t43Var.getValue()).getHorizontalSpacingScale(), hx2.a, hx2.g, ((LiveDanmakuSettings) t43Var3.getValue()).getEmojiEnabled(), go1Var, 1573248, 0);
                    go1Var = go1Var;
                    go1Var.q(true);
                    hv4Var3 = hv4Var5;
                    z9 = z17;
                    z10 = z18;
                    z8 = z19;
                }
            }
            u2.d = hn1Var;
        }
        go1Var.W();
        z8 = z7;
        hv4Var3 = hv4Var2;
        z9 = z5;
        z10 = z6;
        u2 = go1Var.u();
        if (u2 != null) {
            final byte b7 = 4;
            hn1Var = new hn1() { // from class: sm2
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj22) {
                    byte b42 = b7;
                    wd5 wd5Var = wd5.a;
                    int i152 = i2;
                    switch (b42) {
                        case 0:
                            ((Integer) obj22).getClass();
                            int X2 = mu0.X(i152 | 1);
                            wx5.b(op2Var, str, l13Var, hv4Var3, x70Var, z9, z10, z8, (fe0) obj2, X2, i3);
                            break;
                        case 1:
                            ((Integer) obj22).getClass();
                            int X3 = mu0.X(i152 | 1);
                            wx5.b(op2Var, str, l13Var, hv4Var3, x70Var, z9, z10, z8, (fe0) obj2, X3, i3);
                            break;
                        case 2:
                            ((Integer) obj22).getClass();
                            int X4 = mu0.X(i152 | 1);
                            wx5.b(op2Var, str, l13Var, hv4Var3, x70Var, z9, z10, z8, (fe0) obj2, X4, i3);
                            break;
                        case 3:
                            ((Integer) obj22).getClass();
                            int X5 = mu0.X(i152 | 1);
                            wx5.b(op2Var, str, l13Var, hv4Var3, x70Var, z9, z10, z8, (fe0) obj2, X5, i3);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            int X6 = mu0.X(i152 | 1);
                            wx5.b(op2Var, str, l13Var, hv4Var3, x70Var, z9, z10, z8, (fe0) obj2, X6, i3);
                            break;
                    }
                    return wd5Var;
                }
            };
            u2.d = hn1Var;
        }
    }

    public static final void c(final lu4 lu4Var, l13 l13Var, final boolean z2, fe0 fe0Var, final int i2) {
        final l13 l13Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1418866928);
        int i3 = i2 | (go1Var.i(lu4Var) ? 4 : 2) | 48;
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            final i13 i13Var = i13.a;
            if (lu4Var == null) {
                x04 u2 = go1Var.u();
                if (u2 != null) {
                    final byte b2 = 0;
                    u2.d = new hn1(lu4Var, i13Var, z2, i2, b2) { // from class: zg4
                        public final /* synthetic */ byte I;
                        public final /* synthetic */ lu4 J;
                        public final /* synthetic */ l13 K;
                        public final /* synthetic */ boolean L;

                        {
                            this.I = b2;
                        }

                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.I;
                            wd5 wd5Var = wd5.a;
                            boolean z3 = this.L;
                            l13 l13Var3 = this.K;
                            lu4 lu4Var2 = this.J;
                            fe0 fe0Var2 = (fe0) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    wx5.c(lu4Var2, l13Var3, z3, fe0Var2, mu0.X(393));
                                    break;
                                case 1:
                                    wx5.c(lu4Var2, l13Var3, z3, fe0Var2, mu0.X(393));
                                    break;
                                default:
                                    wx5.c(lu4Var2, l13Var3, z3, fe0Var2, mu0.X(393));
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    return;
                }
                return;
            }
            long j2 = lu4Var.c;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
            if (intBitsToFloat <= 0.0f) {
                x04 u3 = go1Var.u();
                if (u3 != null) {
                    final byte b3 = 1;
                    u3.d = new hn1(lu4Var, i13Var, z2, i2, b3) { // from class: zg4
                        public final /* synthetic */ byte I;
                        public final /* synthetic */ lu4 J;
                        public final /* synthetic */ l13 K;
                        public final /* synthetic */ boolean L;

                        {
                            this.I = b3;
                        }

                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b32 = this.I;
                            wd5 wd5Var = wd5.a;
                            boolean z3 = this.L;
                            l13 l13Var3 = this.K;
                            lu4 lu4Var2 = this.J;
                            fe0 fe0Var2 = (fe0) obj;
                            ((Integer) obj2).getClass();
                            switch (b32) {
                                case 0:
                                    wx5.c(lu4Var2, l13Var3, z3, fe0Var2, mu0.X(393));
                                    break;
                                case 1:
                                    wx5.c(lu4Var2, l13Var3, z3, fe0Var2, mu0.X(393));
                                    break;
                                default:
                                    wx5.c(lu4Var2, l13Var3, z3, fe0Var2, mu0.X(393));
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    return;
                }
                return;
            }
            k74 a2 = l74.a(8.0f);
            l13 then = mw2.p(o7.m(intBitsToFloat >= 1.0f ? j42.e(nq4.g(i13Var, 108.0f), intBitsToFloat, false) : j42.e(nq4.n(i13Var, 96.0f), intBitsToFloat, false), a2), hx2.h, mw2.j).then(z2 ? j42.g(i13Var, 2.0f, hx2.a, a2) : i13Var);
            uw2 c2 = px.c(q8.J, false);
            long j3 = go1Var.T;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, then);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            ne1 ne1Var = nq4.c;
            boolean z3 = (i3 & 14) == 4 || go1Var.i(lu4Var);
            Object Q2 = go1Var.Q();
            if (z3 || Q2 == de0.a) {
                Q2 = new tf2(lu4Var, (byte) 22);
                go1Var.o0(Q2);
            }
            p70.j(6, go1Var, (tm1) Q2, ne1Var);
            go1Var.q(true);
            l13Var2 = i13Var;
        } else {
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u4 = go1Var.u();
        if (u4 != null) {
            final byte b4 = 2;
            u4.d = new hn1(lu4Var, l13Var2, z2, i2, b4) { // from class: zg4
                public final /* synthetic */ byte I;
                public final /* synthetic */ lu4 J;
                public final /* synthetic */ l13 K;
                public final /* synthetic */ boolean L;

                {
                    this.I = b4;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    byte b32 = this.I;
                    wd5 wd5Var = wd5.a;
                    boolean z32 = this.L;
                    l13 l13Var3 = this.K;
                    lu4 lu4Var2 = this.J;
                    fe0 fe0Var2 = (fe0) obj;
                    ((Integer) obj2).getClass();
                    switch (b32) {
                        case 0:
                            wx5.c(lu4Var2, l13Var3, z32, fe0Var2, mu0.X(393));
                            break;
                        case 1:
                            wx5.c(lu4Var2, l13Var3, z32, fe0Var2, mu0.X(393));
                            break;
                        default:
                            wx5.c(lu4Var2, l13Var3, z32, fe0Var2, mu0.X(393));
                            break;
                    }
                    return wd5Var;
                }
            };
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static l13 e(l13 l13Var) {
        return l13Var.then(new uv2(1200, w, 30.0f));
    }

    public static void f(ct ctVar) {
        int i2 = ctVar.J;
        if (i2 == 128) {
            return;
        }
        s83.t("Expected CONTEXT tag but found ".concat(i2 != 64 ? i2 != 128 ? i2 != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ux5 g(android.content.Context r33, defpackage.uf0 r34) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx5.g(android.content.Context, uf0):ux5");
    }

    public static final u95 h(hn3 hn3Var, oj ojVar) {
        hn3Var.getClass();
        int length = ojVar.J.length();
        int length2 = ojVar.J.length();
        int min = Math.min(length, 100);
        for (int i2 = 0; i2 < min; i2++) {
            V(i2, length2, i2);
        }
        V(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < min2; i3++) {
            W(i3, length, i3);
        }
        W(length2, length, length2);
        return new u95(ojVar, new rs(ojVar.J.length(), ojVar.J.length()));
    }

    public static String i(int i2, int i3) {
        return r7.z(i2 != 64 ? i2 != 128 ? i2 != 192 ? "[UNIVERSAL " : "[PRIVATE " : "[CONTEXT " : "[APPLICATION ", i3, "]");
    }

    public static final l13 j(l13 l13Var) {
        return l13Var.then(new y32());
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = ((jArr[2] << 40) ^ (j3 >>> 24)) & 17592186044415L;
        long j5 = ((j2 >>> 44) ^ (j3 << 20)) & 17592186044415L;
        long j6 = j2 & 17592186044415L;
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = ((j8 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j10 = ((j7 >>> 44) ^ (j8 << 20)) & 17592186044415L;
        long j11 = j7 & 17592186044415L;
        long[] jArr4 = new long[10];
        l(jArr3, j6, j11, jArr4, 0);
        l(jArr3, j4, j9, jArr4, 2);
        long j12 = (j6 ^ j5) ^ j4;
        long j13 = (j11 ^ j10) ^ j9;
        l(jArr3, j12, j13, jArr4, 4);
        long j14 = (j5 << 1) ^ (j4 << 2);
        long j15 = (j10 << 1) ^ (j9 << 2);
        l(jArr3, j6 ^ j14, j11 ^ j15, jArr4, 6);
        l(jArr3, j12 ^ j14, j13 ^ j15, jArr4, 8);
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
        long j29 = (((j24 ^ j21) ^ (j28 << 4)) ^ (j28 << 1)) ^ (j27 >>> 44);
        long j30 = (j25 ^ j19) ^ (j29 >>> 44);
        long j31 = ((j27 & 17592186044415L) >>> 1) ^ ((j29 & 1) << 43);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 17592186044415L;
        long j38 = (((j29 & 17592186044415L) >>> 1) ^ ((j30 & 1) << 43)) ^ (j37 >>> 43);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = 17592186044415L & (j43 ^ (j43 << 32));
        long j45 = (j30 >>> 1) ^ (j44 >>> 43);
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
        jArr3[0] = j22 ^ (j52 << 44);
        jArr3[1] = (j52 >>> 20) ^ (j53 << 24);
        jArr3[2] = ((j53 >>> 40) ^ (j54 << 4)) ^ (j55 << 48);
        jArr3[3] = ((j54 >>> 60) ^ (j56 << 28)) ^ (j55 >>> 16);
        jArr3[4] = j56 >>> 36;
        jArr3[5] = 0;
    }

    public static void l(long[] jArr, long j2, long j3, long[] jArr2, int i2) {
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
        int i3 = (int) j2;
        long j8 = (((jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6)) ^ (jArr[(i3 >>> 9) & 7] << 9)) ^ (jArr[(i3 >>> 12) & 7] << 12);
        long j9 = 0;
        int i4 = 30;
        do {
            int i5 = (int) (j2 >>> i4);
            long j10 = (((jArr[i5 & 7] ^ (jArr[(i5 >>> 3) & 7] << 3)) ^ (jArr[(i5 >>> 6) & 7] << 6)) ^ (jArr[(i5 >>> 9) & 7] << 9)) ^ (jArr[(i5 >>> 12) & 7] << 12);
            j8 ^= j10 << i4;
            j9 ^= j10 >>> (-i4);
            i4 -= 15;
        } while (i4 > 0);
        jArr2[i2] = 17592186044415L & j8;
        jArr2[i2 + 1] = (j8 >>> 44) ^ (j9 << 20);
    }

    public static void m(long[] jArr, long[] jArr2) {
        e41.E(2, jArr, jArr2);
        int i2 = ((int) jArr[2]) & 255;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        jArr2[4] = (i4 | (i4 << 1)) & 21845 & 4294967295L;
    }

    public static int n(float f2) {
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
        float[] fArr = d;
        return w90.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static float o(int i2) {
        float p2 = p(Color.red(i2));
        float p3 = p(Color.green(i2));
        float p4 = p(Color.blue(i2));
        float[] fArr = e[1];
        float f2 = ((p4 * fArr[2]) + ((p3 * fArr[1]) + (p2 * fArr[0]))) / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    public static float p(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void q(Canvas canvas, zh0 zh0Var, float f2, float f3) {
        int save = canvas.save();
        canvas.translate(f2, f3);
        ((ya2) zh0Var).a();
        canvas.restoreToCount(save);
    }

    public static final int r(qe2 qe2Var, boolean z2) {
        int i2;
        int a2;
        if (z2) {
            i2 = qe2Var.c();
            a2 = qe2Var.e();
        } else {
            i2 = qe2Var.i();
            a2 = qe2Var.a();
        }
        return a2 + i2;
    }

    public static void s(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        jl2.a0(iArr, iArr2, iArr4);
        x(iArr4, iArr3);
    }

    public static void t(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        k(jArr, jArr2, jArr4);
        y(jArr4, jArr3);
    }

    public static void u(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        lq2.V(iArr, iArr2, iArr4);
        z(iArr4, iArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long v(int r32, int r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx5.v(int, int, java.lang.String):long");
    }

    public static l13 w(v8 v8Var, long j2, long j3, int i2) {
        if ((i2 & 2) != 0) {
            j2 = p65.c;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = p65.c;
        }
        return new a9(v8Var, j4, j3);
    }

    public static void x(int[] iArr, int[] iArr2) {
        int i2 = iArr[7];
        int i3 = i2;
        int i4 = 0;
        while (i4 < 8) {
            int i5 = iArr[8 + i4];
            iArr2[i4] = (i3 >>> 31) | (i5 << 1);
            i4++;
            i3 = i5;
        }
        long j2 = ((iArr2[0] & 4294967295L) * 19) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((iArr2[1] & 4294967295L) * 19) + (iArr[1] & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j4 = ((iArr2[2] & 4294967295L) * 19) + (iArr[2] & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j4;
        long j5 = ((iArr2[3] & 4294967295L) * 19) + (iArr[3] & 4294967295L) + (j4 >>> 32);
        iArr2[3] = (int) j5;
        long j6 = ((iArr2[4] & 4294967295L) * 19) + (iArr[4] & 4294967295L) + (j5 >>> 32);
        iArr2[4] = (int) j6;
        long j7 = ((iArr2[5] & 4294967295L) * 19) + (iArr[5] & 4294967295L) + (j6 >>> 32);
        iArr2[5] = (int) j7;
        long j8 = ((iArr2[6] & 4294967295L) * 19) + (iArr[6] & 4294967295L) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        long j9 = (19 * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]) + (j8 >>> 32);
        int i6 = (int) j9;
        iArr2[7] = i6;
        iArr2[7] = dq2.i(7, (((i6 >>> 31) - (i2 >>> 31)) + (((int) (j9 >>> 32)) << 1)) * 19, iArr2) + (Integer.MAX_VALUE & i6);
        if (jl2.K(iArr2, p)) {
            P(iArr2);
        }
    }

    public static void y(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = j5 ^ (j6 >>> 59);
        long j8 = j2 ^ ((j7 << 61) ^ (j7 << 63));
        long j9 = (j3 ^ ((j6 << 61) ^ (j6 << 63))) ^ ((((j7 >>> 3) ^ (j7 >>> 1)) ^ j7) ^ (j7 << 5));
        long j10 = (j4 ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5))) ^ (j7 >>> 59);
        long j11 = j10 >>> 3;
        jArr2[0] = (((j8 ^ j11) ^ (j11 << 2)) ^ (j11 << 3)) ^ (j11 << 8);
        jArr2[1] = (j10 >>> 59) ^ j9;
        jArr2[2] = 7 & j10;
    }

    public static void z(int[] iArr, int[] iArr2) {
        long j2 = iArr[6] & 4294967295L;
        long j3 = (4553 * j2) + (iArr[0] & 4294967295L);
        int i2 = (int) j3;
        iArr2[0] = i2;
        long j4 = iArr[7] & 4294967295L;
        long j5 = (4553 * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i3 = (int) j5;
        iArr2[1] = i3;
        long j6 = iArr[8] & 4294967295L;
        long j7 = (4553 * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i4 = (int) j7;
        iArr2[2] = i4;
        long j8 = iArr[9] & 4294967295L;
        long j9 = (4553 * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i5 = (int) j9;
        iArr2[3] = i5;
        long j10 = iArr[10] & 4294967295L;
        long j11 = (4553 * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[11] & 4294967295L;
        long j13 = (4553 * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = (j13 >>> 32) + j12;
        long j15 = j14 & 4294967295L;
        long j16 = (4553 * j15) + (i2 & 4294967295L);
        iArr2[0] = (int) j16;
        long j17 = j14 >>> 32;
        long j18 = (4553 * j17) + j15 + (i3 & 4294967295L) + (j16 >>> 32);
        iArr2[1] = (int) j18;
        long j19 = j17 + (i4 & 4294967295L) + (j18 >>> 32);
        iArr2[2] = (int) j19;
        long j20 = (j19 >>> 32) + (i5 & 4294967295L);
        iArr2[3] = (int) j20;
        if (((j20 >>> 32) == 0 ? 0 : dq2.Z(6, 4, iArr2)) != 0 || (iArr2[5] == -1 && lq2.M(iArr2, g0))) {
            dq2.c(6, 4553, iArr2);
        }
    }
}
