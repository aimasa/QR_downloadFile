/*
 * This file is generated by jOOQ.
 */
package cn.aimasa.hetongfenglei.pojo.po;


import cn.aimasa.hetongfenglei.pojo.po.tables.File;
import cn.aimasa.hetongfenglei.pojo.po.tables.FlywaySchemaHistory;
import cn.aimasa.hetongfenglei.pojo.po.tables.User;
import cn.aimasa.hetongfenglei.pojo.po.tables.records.FileRecord;
import cn.aimasa.hetongfenglei.pojo.po.tables.records.FlywaySchemaHistoryRecord;
import cn.aimasa.hetongfenglei.pojo.po.tables.records.UserRecord;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>classfiy_contact</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<FileRecord, Integer> IDENTITY_FILE = Identities0.IDENTITY_FILE;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FileRecord> KEY_FILE_PRIMARY = UniqueKeys0.KEY_FILE_PRIMARY;
    public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = UniqueKeys0.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<FileRecord, Integer> IDENTITY_FILE = Internal.createIdentity(File.FILE, File.FILE.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<FileRecord> KEY_FILE_PRIMARY = Internal.createUniqueKey(File.FILE, "KEY_file_PRIMARY", new TableField[] { File.FILE.ID }, true);
        public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "KEY_flyway_schema_history_PRIMARY", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", new TableField[] { User.USER.ID }, true);
    }
}
