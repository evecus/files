package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.util.AtomicFile;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.database.VersionTable;
import defpackage.ee5;
import defpackage.hf1;
import defpackage.s83;
import defpackage.sp0;
import defpackage.sy1;
import defpackage.zl1;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
class CachedContentIndex {
    static final String FILE_NAME_ATOMIC = "cached_content_index.exi";
    private static final int INCREMENTAL_METADATA_READ_LENGTH = 10485760;
    private final SparseArray<String> idToKey;
    private final HashMap<String, CachedContent> keyToContent;
    private final SparseBooleanArray newIds;
    private Storage previousStorage;
    private final SparseBooleanArray removedIds;
    private Storage storage;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Storage {
        void delete();

        boolean exists();

        void initialize(long j);

        void load(HashMap<String, CachedContent> hashMap, SparseArray<String> sparseArray);

        void onRemove(CachedContent cachedContent, boolean z);

        void onUpdate(CachedContent cachedContent);

        void storeFully(HashMap<String, CachedContent> hashMap);

        void storeIncremental(HashMap<String, CachedContent> hashMap);
    }

    public CachedContentIndex(DatabaseProvider databaseProvider, File file, byte[] bArr, boolean z, boolean z2) {
        sp0.z((databaseProvider == null && file == null) ? false : true);
        this.keyToContent = new HashMap<>();
        this.idToKey = new SparseArray<>();
        this.removedIds = new SparseBooleanArray();
        this.newIds = new SparseBooleanArray();
        DatabaseStorage databaseStorage = databaseProvider != null ? new DatabaseStorage(databaseProvider) : null;
        LegacyStorage legacyStorage = file != null ? new LegacyStorage(new File(file, FILE_NAME_ATOMIC), bArr, z) : null;
        if (databaseStorage == null || (legacyStorage != null && z2)) {
            this.storage = (Storage) Util.castNonNull(legacyStorage);
            this.previousStorage = databaseStorage;
        } else {
            this.storage = databaseStorage;
            this.previousStorage = legacyStorage;
        }
    }

    private CachedContent addNew(String str) {
        int newId = getNewId(this.idToKey);
        CachedContent cachedContent = new CachedContent(newId, str);
        this.keyToContent.put(str, cachedContent);
        this.idToKey.put(newId, str);
        this.newIds.put(newId, true);
        this.storage.onUpdate(cachedContent);
        return cachedContent;
    }

    public static void delete(DatabaseProvider databaseProvider, long j) {
        DatabaseStorage.delete(databaseProvider, j);
    }

    public static int getNewId(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt >= 0) {
            return keyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    public static boolean isIndexFile(String str) {
        return str.startsWith(FILE_NAME_ATOMIC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DefaultContentMetadata readContentMetadata(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                zl1.g(hf1.u(readInt2, "Invalid value size: "));
                return null;
            }
            int min = Math.min(readInt2, INCREMENTAL_METADATA_READ_LENGTH);
            byte[] bArr = Util.EMPTY_BYTE_ARRAY;
            int i2 = 0;
            while (i2 != readInt2) {
                int i3 = i2 + min;
                bArr = Arrays.copyOf(bArr, i3);
                dataInputStream.readFully(bArr, i2, min);
                min = Math.min(readInt2 - i3, INCREMENTAL_METADATA_READ_LENGTH);
                i2 = i3;
            }
            hashMap.put(readUTF, bArr);
        }
        return new DefaultContentMetadata(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeContentMetadata(DefaultContentMetadata defaultContentMetadata, DataOutputStream dataOutputStream) {
        Set<Map.Entry<String, byte[]>> entrySet = defaultContentMetadata.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry<String, byte[]> entry : entrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        CachedContent orAdd = getOrAdd(str);
        if (orAdd.applyMetadataMutations(contentMetadataMutations)) {
            this.storage.onUpdate(orAdd);
        }
    }

    public int assignIdForKey(String str) {
        return getOrAdd(str).id;
    }

    public CachedContent get(String str) {
        return this.keyToContent.get(str);
    }

    public Collection<CachedContent> getAll() {
        return DesugarCollections.unmodifiableCollection(this.keyToContent.values());
    }

    public ContentMetadata getContentMetadata(String str) {
        CachedContent cachedContent = get(str);
        return cachedContent != null ? cachedContent.getMetadata() : DefaultContentMetadata.EMPTY;
    }

    public String getKeyForId(int i) {
        return this.idToKey.get(i);
    }

    public Set<String> getKeys() {
        return this.keyToContent.keySet();
    }

    public CachedContent getOrAdd(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        return cachedContent == null ? addNew(str) : cachedContent;
    }

    public void initialize(long j) {
        Storage storage;
        this.storage.initialize(j);
        Storage storage2 = this.previousStorage;
        if (storage2 != null) {
            storage2.initialize(j);
        }
        if (this.storage.exists() || (storage = this.previousStorage) == null || !storage.exists()) {
            this.storage.load(this.keyToContent, this.idToKey);
        } else {
            this.previousStorage.load(this.keyToContent, this.idToKey);
            this.storage.storeFully(this.keyToContent);
        }
        Storage storage3 = this.previousStorage;
        if (storage3 != null) {
            storage3.delete();
            this.previousStorage = null;
        }
    }

    public void maybeRemove(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        if (cachedContent != null && cachedContent.isEmpty() && cachedContent.isFullyUnlocked()) {
            this.keyToContent.remove(str);
            int i = cachedContent.id;
            boolean z = this.newIds.get(i);
            this.storage.onRemove(cachedContent, z);
            SparseArray<String> sparseArray = this.idToKey;
            if (z) {
                sparseArray.remove(i);
                this.newIds.delete(i);
            } else {
                sparseArray.put(i, null);
                this.removedIds.put(i, true);
            }
        }
    }

    public void removeEmpty() {
        ee5 it = sy1.o(this.keyToContent.keySet()).iterator();
        while (it.hasNext()) {
            maybeRemove((String) it.next());
        }
    }

    public void store() {
        this.storage.storeIncremental(this.keyToContent);
        int size = this.removedIds.size();
        for (int i = 0; i < size; i++) {
            this.idToKey.remove(this.removedIds.keyAt(i));
        }
        this.removedIds.clear();
        this.newIds.clear();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class LegacyStorage implements Storage {
        private static final int FLAG_ENCRYPTED_INDEX = 1;
        private static final int VERSION = 2;
        private static final int VERSION_METADATA_INTRODUCED = 2;
        private final AtomicFile atomicFile;
        private ReusableBufferedOutputStream bufferedOutputStream;
        private boolean changed;
        private final Cipher cipher;
        private final boolean encrypt;
        private final SecureRandom random;
        private final SecretKeySpec secretKeySpec;

        public LegacyStorage(File file, byte[] bArr, boolean z) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            sp0.z((bArr == null && z) ? false : true);
            if (bArr != null) {
                sp0.o(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                sp0.o(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.encrypt = z;
            this.cipher = cipher;
            this.secretKeySpec = secretKeySpec;
            this.random = z ? new SecureRandom() : null;
            this.atomicFile = new AtomicFile(file);
        }

        private int hashCachedContent(CachedContent cachedContent, int i) {
            int hashCode = cachedContent.key.hashCode() + (cachedContent.id * 31);
            if (i < 2) {
                long j = cachedContent.getMetadata().get(ContentMetadata.KEY_CONTENT_LENGTH, -1L);
                return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
            }
            return cachedContent.getMetadata().hashCode() + (hashCode * 31);
        }

        private CachedContent readCachedContent(int i, DataInputStream dataInputStream) {
            DefaultContentMetadata readContentMetadata;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i < 2) {
                long readLong = dataInputStream.readLong();
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                ContentMetadataMutations.setContentLength(contentMetadataMutations, readLong);
                readContentMetadata = DefaultContentMetadata.EMPTY.copyWithMutationsApplied(contentMetadataMutations);
            } else {
                readContentMetadata = CachedContentIndex.readContentMetadata(dataInputStream);
            }
            return new CachedContent(readInt, readUTF, readContentMetadata);
        }

        private boolean readFile(HashMap<String, CachedContent> hashMap, SparseArray<String> sparseArray) {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            if (!this.atomicFile.exists()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.atomicFile.openRead());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int readInt = dataInputStream.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.cipher == null) {
                            Util.closeQuietly(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.cipher.init(2, (Key) Util.castNonNull(this.secretKeySpec), new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.cipher));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.encrypt) {
                        this.changed = true;
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        CachedContent readCachedContent = readCachedContent(readInt, dataInputStream);
                        hashMap.put(readCachedContent.key, readCachedContent);
                        sparseArray.put(readCachedContent.id, readCachedContent.key);
                        i += hashCachedContent(readCachedContent, readInt);
                    }
                    int readInt3 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (readInt3 == i && z) {
                        Util.closeQuietly(dataInputStream);
                        return true;
                    }
                    Util.closeQuietly(dataInputStream);
                    return false;
                }
                Util.closeQuietly(dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    Util.closeQuietly(dataInputStream2);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    Util.closeQuietly(dataInputStream2);
                }
                throw th;
            }
        }

        private void writeCachedContent(CachedContent cachedContent, DataOutputStream dataOutputStream) {
            dataOutputStream.writeInt(cachedContent.id);
            dataOutputStream.writeUTF(cachedContent.key);
            CachedContentIndex.writeContentMetadata(cachedContent.getMetadata(), dataOutputStream);
        }

        private void writeFile(HashMap<String, CachedContent> hashMap) {
            ReusableBufferedOutputStream reusableBufferedOutputStream;
            DataOutputStream dataOutputStream;
            Closeable closeable = null;
            try {
                OutputStream startWrite = this.atomicFile.startWrite();
                ReusableBufferedOutputStream reusableBufferedOutputStream2 = this.bufferedOutputStream;
                if (reusableBufferedOutputStream2 == null) {
                    this.bufferedOutputStream = new ReusableBufferedOutputStream(startWrite);
                } else {
                    reusableBufferedOutputStream2.reset(startWrite);
                }
                reusableBufferedOutputStream = this.bufferedOutputStream;
                dataOutputStream = new DataOutputStream(reusableBufferedOutputStream);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.encrypt ? 1 : 0);
                if (this.encrypt) {
                    byte[] bArr = new byte[16];
                    ((SecureRandom) Util.castNonNull(this.random)).nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        ((Cipher) Util.castNonNull(this.cipher)).init(1, (Key) Util.castNonNull(this.secretKeySpec), new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(reusableBufferedOutputStream, this.cipher));
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(hashMap.size());
                int i = 0;
                for (CachedContent cachedContent : hashMap.values()) {
                    writeCachedContent(cachedContent, dataOutputStream);
                    i += hashCachedContent(cachedContent, 2);
                }
                dataOutputStream.writeInt(i);
                this.atomicFile.endWrite(dataOutputStream);
                Util.closeQuietly(null);
            } catch (Throwable th2) {
                th = th2;
                closeable = dataOutputStream;
                Util.closeQuietly(closeable);
                throw th;
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void delete() {
            this.atomicFile.delete();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public boolean exists() {
            return this.atomicFile.exists();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void load(HashMap<String, CachedContent> hashMap, SparseArray<String> sparseArray) {
            sp0.z(!this.changed);
            if (readFile(hashMap, sparseArray)) {
                return;
            }
            hashMap.clear();
            sparseArray.clear();
            this.atomicFile.delete();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onRemove(CachedContent cachedContent, boolean z) {
            this.changed = true;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onUpdate(CachedContent cachedContent) {
            this.changed = true;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeFully(HashMap<String, CachedContent> hashMap) {
            writeFile(hashMap);
            this.changed = false;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeIncremental(HashMap<String, CachedContent> hashMap) {
            if (this.changed) {
                storeFully(hashMap);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void initialize(long j) {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class DatabaseStorage implements Storage {
        private static final String COLUMN_ID = "id";
        private static final int COLUMN_INDEX_ID = 0;
        private static final int COLUMN_INDEX_KEY = 1;
        private static final int COLUMN_INDEX_METADATA = 2;
        private static final String COLUMN_METADATA = "metadata";
        private static final String TABLE_PREFIX = "ExoPlayerCacheIndex";
        private static final String TABLE_SCHEMA = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";
        private static final int TABLE_VERSION = 1;
        private static final String WHERE_ID_EQUALS = "id = ?";
        private final DatabaseProvider databaseProvider;
        private String hexUid;
        private final SparseArray<CachedContent> pendingUpdates = new SparseArray<>();
        private String tableName;
        private static final String COLUMN_KEY = "key";
        private static final String[] COLUMNS = {"id", COLUMN_KEY, "metadata"};

        public DatabaseStorage(DatabaseProvider databaseProvider) {
            this.databaseProvider = databaseProvider;
        }

        private void addOrUpdateRow(SQLiteDatabase sQLiteDatabase, CachedContent cachedContent) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CachedContentIndex.writeContentMetadata(cachedContent.getMetadata(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(cachedContent.id));
            contentValues.put(COLUMN_KEY, cachedContent.key);
            contentValues.put("metadata", byteArray);
            String str = this.tableName;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        private static void delete(DatabaseProvider databaseProvider, String str) {
            try {
                String tableName = getTableName(str);
                SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.removeVersion(writableDatabase, 1, str);
                    dropTable(writableDatabase, tableName);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e) {
                s83.g(e);
            }
        }

        private void deleteRow(SQLiteDatabase sQLiteDatabase, int i) {
            String str = this.tableName;
            str.getClass();
            sQLiteDatabase.delete(str, WHERE_ID_EQUALS, new String[]{Integer.toString(i)});
        }

        private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor getCursor() {
            SQLiteDatabase readableDatabase = this.databaseProvider.getReadableDatabase();
            String str = this.tableName;
            str.getClass();
            return readableDatabase.query(str, COLUMNS, null, null, null, null, null);
        }

        private static String getTableName(String str) {
            return hf1.w(TABLE_PREFIX, str);
        }

        private void initializeTable(SQLiteDatabase sQLiteDatabase) {
            String str = this.hexUid;
            str.getClass();
            VersionTable.setVersion(sQLiteDatabase, 1, str, 1);
            String str2 = this.tableName;
            str2.getClass();
            dropTable(sQLiteDatabase, str2);
            sQLiteDatabase.execSQL("CREATE TABLE " + this.tableName + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public boolean exists() {
            try {
                SQLiteDatabase readableDatabase = this.databaseProvider.getReadableDatabase();
                String str = this.hexUid;
                str.getClass();
                return VersionTable.getVersion(readableDatabase, 1, str) != -1;
            } catch (SQLException e) {
                s83.g(e);
                return false;
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void initialize(long j) {
            String hexString = Long.toHexString(j);
            this.hexUid = hexString;
            this.tableName = getTableName(hexString);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void load(HashMap<String, CachedContent> hashMap, SparseArray<String> sparseArray) {
            sp0.z(this.pendingUpdates.size() == 0);
            try {
                SQLiteDatabase readableDatabase = this.databaseProvider.getReadableDatabase();
                String str = this.hexUid;
                str.getClass();
                if (VersionTable.getVersion(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        initializeTable(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursor = getCursor();
                while (cursor.moveToNext()) {
                    try {
                        int i = cursor.getInt(0);
                        String string = cursor.getString(1);
                        string.getClass();
                        CachedContent cachedContent = new CachedContent(i, string, CachedContentIndex.readContentMetadata(new DataInputStream(new ByteArrayInputStream(cursor.getBlob(2)))));
                        hashMap.put(cachedContent.key, cachedContent);
                        sparseArray.put(cachedContent.id, cachedContent.key);
                    } finally {
                    }
                }
                cursor.close();
            } catch (SQLiteException e) {
                hashMap.clear();
                sparseArray.clear();
                s83.g(e);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onRemove(CachedContent cachedContent, boolean z) {
            SparseArray<CachedContent> sparseArray = this.pendingUpdates;
            if (z) {
                sparseArray.delete(cachedContent.id);
            } else {
                sparseArray.put(cachedContent.id, null);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onUpdate(CachedContent cachedContent) {
            this.pendingUpdates.put(cachedContent.id, cachedContent);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeFully(HashMap<String, CachedContent> hashMap) {
            try {
                SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    initializeTable(writableDatabase);
                    Iterator<CachedContent> it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        addOrUpdateRow(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.pendingUpdates.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e) {
                s83.g(e);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeIncremental(HashMap<String, CachedContent> hashMap) {
            if (this.pendingUpdates.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.pendingUpdates.size(); i++) {
                    try {
                        CachedContent valueAt = this.pendingUpdates.valueAt(i);
                        if (valueAt == null) {
                            deleteRow(writableDatabase, this.pendingUpdates.keyAt(i));
                        } else {
                            addOrUpdateRow(writableDatabase, valueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.pendingUpdates.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                s83.g(e);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void delete() {
            DatabaseProvider databaseProvider = this.databaseProvider;
            String str = this.hexUid;
            str.getClass();
            delete(databaseProvider, str);
        }

        public static void delete(DatabaseProvider databaseProvider, long j) {
            delete(databaseProvider, Long.toHexString(j));
        }
    }

    public CachedContentIndex(DatabaseProvider databaseProvider) {
        this(databaseProvider, null, null, false, false);
    }
}
