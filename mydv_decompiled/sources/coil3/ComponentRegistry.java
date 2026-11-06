package coil3;

import coil3.ComponentRegistry;
import coil3.decode.Decoder;
import coil3.fetch.Fetcher;
import coil3.fetch.SourceFetchResult;
import coil3.intercept.Interceptor;
import coil3.key.Keyer;
import coil3.map.Mapper;
import coil3.request.Options;
import coil3.util.Collections_jvmCommonKt;
import defpackage.eq;
import defpackage.er0;
import defpackage.j42;
import defpackage.k60;
import defpackage.k9;
import defpackage.nc0;
import defpackage.o70;
import defpackage.o91;
import defpackage.p70;
import defpackage.rm1;
import defpackage.t72;
import defpackage.u05;
import defpackage.u70;
import defpackage.uc2;
import defpackage.uj3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ComponentRegistry {
    private final uc2 decoderFactories$delegate;
    private final uc2 fetcherFactories$delegate;
    private final List<Interceptor> interceptors;
    private final List<uj3> keyers;
    private List<? extends rm1> lazyDecoderFactories;
    private List<? extends rm1> lazyFetcherFactories;
    private final List<uj3> mappers;

    /* JADX WARN: Multi-variable type inference failed */
    private ComponentRegistry(List<? extends Interceptor> list, List<? extends uj3> list2, List<? extends uj3> list3, List<? extends rm1> list4, List<? extends rm1> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.lazyFetcherFactories = list4;
        this.lazyDecoderFactories = list5;
        final byte b = 0;
        this.fetcherFactories$delegate = new u05(new rm1(this) { // from class: mc0
            public final /* synthetic */ ComponentRegistry J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                List fetcherFactories_delegate$lambda$0;
                List decoderFactories_delegate$lambda$0;
                byte b2 = b;
                ComponentRegistry componentRegistry = this.J;
                switch (b2) {
                    case 0:
                        fetcherFactories_delegate$lambda$0 = ComponentRegistry.fetcherFactories_delegate$lambda$0(componentRegistry);
                        return fetcherFactories_delegate$lambda$0;
                    default:
                        decoderFactories_delegate$lambda$0 = ComponentRegistry.decoderFactories_delegate$lambda$0(componentRegistry);
                        return decoderFactories_delegate$lambda$0;
                }
            }
        });
        final byte b2 = 1;
        this.decoderFactories$delegate = new u05(new rm1(this) { // from class: mc0
            public final /* synthetic */ ComponentRegistry J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                List fetcherFactories_delegate$lambda$0;
                List decoderFactories_delegate$lambda$0;
                byte b22 = b2;
                ComponentRegistry componentRegistry = this.J;
                switch (b22) {
                    case 0:
                        fetcherFactories_delegate$lambda$0 = ComponentRegistry.fetcherFactories_delegate$lambda$0(componentRegistry);
                        return fetcherFactories_delegate$lambda$0;
                    default:
                        decoderFactories_delegate$lambda$0 = ComponentRegistry.decoderFactories_delegate$lambda$0(componentRegistry);
                        return decoderFactories_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List decoderFactories_delegate$lambda$0(ComponentRegistry componentRegistry) {
        List<? extends rm1> list = componentRegistry.lazyDecoderFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            u70.I0(arrayList, (List) list.get(i).invoke());
        }
        componentRegistry.lazyDecoderFactories = o91.I;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fetcherFactories_delegate$lambda$0(ComponentRegistry componentRegistry) {
        List<? extends rm1> list = componentRegistry.lazyFetcherFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            u70.I0(arrayList, (List) list.get(i).invoke());
        }
        componentRegistry.lazyFetcherFactories = o91.I;
        return arrayList;
    }

    public static /* synthetic */ uj3 newDecoder$default(ComponentRegistry componentRegistry, SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return componentRegistry.newDecoder(sourceFetchResult, options, imageLoader, i);
    }

    public static /* synthetic */ uj3 newFetcher$default(ComponentRegistry componentRegistry, Object obj, Options options, ImageLoader imageLoader, int i, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return componentRegistry.newFetcher(obj, options, imageLoader, i);
    }

    public final List<Decoder.Factory> getDecoderFactories() {
        return (List) this.decoderFactories$delegate.getValue();
    }

    public final List<uj3> getFetcherFactories() {
        return (List) this.fetcherFactories$delegate.getValue();
    }

    public final List<Interceptor> getInterceptors() {
        return this.interceptors;
    }

    public final List<uj3> getKeyers() {
        return this.keyers;
    }

    public final List<uj3> getMappers() {
        return this.mappers;
    }

    public final String key(Object obj, Options options) {
        List<uj3> list = this.keyers;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uj3 uj3Var = list.get(i);
            Keyer keyer = (Keyer) uj3Var.I;
            if (((k60) ((t72) uj3Var.J)).d(obj)) {
                keyer.getClass();
                String key = keyer.key(obj, options);
                if (key != null) {
                    return key;
                }
            }
        }
        return null;
    }

    public final Object map(Object obj, Options options) {
        List<uj3> list = this.mappers;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uj3 uj3Var = list.get(i);
            Mapper mapper = (Mapper) uj3Var.I;
            if (((k60) ((t72) uj3Var.J)).d(obj)) {
                mapper.getClass();
                Object map = mapper.map(obj, options);
                if (map != null) {
                    obj = map;
                }
            }
        }
        return obj;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final uj3 newDecoder(SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader, int i) {
        int size = getDecoderFactories().size();
        while (i < size) {
            Decoder create = getDecoderFactories().get(i).create(sourceFetchResult, options, imageLoader);
            if (create != null) {
                return new uj3(create, Integer.valueOf(i));
            }
            i++;
        }
        return null;
    }

    public final uj3 newFetcher(Object obj, Options options, ImageLoader imageLoader, int i) {
        int size = getFetcherFactories().size();
        while (i < size) {
            uj3 uj3Var = getFetcherFactories().get(i);
            Fetcher.Factory factory = (Fetcher.Factory) uj3Var.I;
            if (((k60) ((t72) uj3Var.J)).d(obj)) {
                factory.getClass();
                Fetcher create = factory.create(obj, options, imageLoader);
                if (create != null) {
                    return new uj3(create, Integer.valueOf(i));
                }
            }
            i++;
        }
        return null;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final List<Interceptor> interceptors;
        private final List<uj3> keyers;
        private final List<rm1> lazyDecoderFactories;
        private final List<rm1> lazyFetcherFactories;
        private final List<uj3> mappers;

        public Builder(ComponentRegistry componentRegistry) {
            this.interceptors = o70.s1(componentRegistry.getInterceptors());
            this.mappers = o70.s1(componentRegistry.getMappers());
            this.keyers = o70.s1(componentRegistry.getKeyers());
            List<uj3> fetcherFactories = componentRegistry.getFetcherFactories();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = fetcherFactories.iterator();
            while (it.hasNext()) {
                arrayList.add(new eq((uj3) it.next(), (byte) 3));
            }
            this.lazyFetcherFactories = arrayList;
            List<Decoder.Factory> decoderFactories = componentRegistry.getDecoderFactories();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = decoderFactories.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new nc0((Decoder.Factory) it2.next(), (byte) 0));
            }
            this.lazyDecoderFactories = arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List add$lambda$3$0(Fetcher.Factory factory, t72 t72Var) {
            return p70.j0(new uj3(factory, t72Var));
        }

        public final <T> Builder add(Fetcher.Factory<T> factory, t72 t72Var) {
            this.lazyFetcherFactories.add(new k9(factory, t72Var, (byte) 4));
            return this;
        }

        public final Builder addDecoderFactories(rm1 rm1Var) {
            this.lazyDecoderFactories.add(rm1Var);
            return this;
        }

        public final Builder addFetcherFactories(rm1 rm1Var) {
            this.lazyFetcherFactories.add(rm1Var);
            return this;
        }

        public final ComponentRegistry build() {
            return new ComponentRegistry(Collections_jvmCommonKt.toImmutableList(this.interceptors), Collections_jvmCommonKt.toImmutableList(this.mappers), Collections_jvmCommonKt.toImmutableList(this.keyers), Collections_jvmCommonKt.toImmutableList(this.lazyFetcherFactories), Collections_jvmCommonKt.toImmutableList(this.lazyDecoderFactories), null);
        }

        public final List<Interceptor> getInterceptors$io_coil_kt_coil3_coil_core() {
            return this.interceptors;
        }

        public final List<uj3> getKeyers$io_coil_kt_coil3_coil_core() {
            return this.keyers;
        }

        public final List<rm1> getLazyDecoderFactories$io_coil_kt_coil3_coil_core() {
            return this.lazyDecoderFactories;
        }

        public final List<rm1> getLazyFetcherFactories$io_coil_kt_coil3_coil_core() {
            return this.lazyFetcherFactories;
        }

        public final List<uj3> getMappers$io_coil_kt_coil3_coil_core() {
            return this.mappers;
        }

        public final <T> Builder add(Mapper<T, ?> mapper, t72 t72Var) {
            this.mappers.add(new uj3(mapper, t72Var));
            return this;
        }

        public final <T> Builder add(Keyer<T> keyer, t72 t72Var) {
            this.keyers.add(new uj3(keyer, t72Var));
            return this;
        }

        public final Builder add(Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public final Builder add(Decoder.Factory factory) {
            this.lazyDecoderFactories.add(new nc0(factory, (byte) 1));
            return this;
        }

        public final <T> Builder add(Fetcher.Factory<T> factory) {
            j42.f0();
            throw null;
        }

        public final <T> Builder add(Keyer<T> keyer) {
            j42.f0();
            throw null;
        }

        public final <T> Builder add(Mapper<T, ?> mapper) {
            j42.f0();
            throw null;
        }

        public Builder() {
            this.interceptors = new ArrayList();
            this.mappers = new ArrayList();
            this.keyers = new ArrayList();
            this.lazyFetcherFactories = new ArrayList();
            this.lazyDecoderFactories = new ArrayList();
        }
    }

    public /* synthetic */ ComponentRegistry(List list, List list2, List list3, List list4, List list5, er0 er0Var) {
        this(list, list2, list3, list4, list5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ComponentRegistry() {
        /*
            r6 = this;
            o91 r1 = defpackage.o91.I
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.ComponentRegistry.<init>():void");
    }

    public final uj3 newDecoder(SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader) {
        return newDecoder$default(this, sourceFetchResult, options, imageLoader, 0, 8, null);
    }

    public final uj3 newFetcher(Object obj, Options options, ImageLoader imageLoader) {
        return newFetcher$default(this, obj, options, imageLoader, 0, 8, null);
    }
}
