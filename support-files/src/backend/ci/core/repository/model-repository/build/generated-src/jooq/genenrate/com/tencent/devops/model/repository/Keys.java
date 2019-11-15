/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.repository;


import com.tencent.devops.model.repository.tables.TRepository;
import com.tencent.devops.model.repository.tables.TRepositoryCodeGit;
import com.tencent.devops.model.repository.tables.TRepositoryCodeGitlab;
import com.tencent.devops.model.repository.tables.TRepositoryCodeP4;
import com.tencent.devops.model.repository.tables.TRepositoryCodeSvn;
import com.tencent.devops.model.repository.tables.TRepositoryCommit;
import com.tencent.devops.model.repository.tables.TRepositoryGithub;
import com.tencent.devops.model.repository.tables.TRepositoryGithubToken;
import com.tencent.devops.model.repository.tables.TRepositoryGithubWhitelist;
import com.tencent.devops.model.repository.tables.TRepositoryGtiToken;
import com.tencent.devops.model.repository.tables.records.TRepositoryCodeGitRecord;
import com.tencent.devops.model.repository.tables.records.TRepositoryCodeGitlabRecord;
import com.tencent.devops.model.repository.tables.records.TRepositoryCodeP4Record;
import com.tencent.devops.model.repository.tables.records.TRepositoryCodeSvnRecord;
import com.tencent.devops.model.repository.tables.records.TRepositoryCommitRecord;
import com.tencent.devops.model.repository.tables.records.TRepositoryGithubRecord;
import com.tencent.devops.model.repository.tables.records.TRepositoryGithubTokenRecord;
import com.tencent.devops.model.repository.tables.records.TRepositoryGithubWhitelistRecord;
import com.tencent.devops.model.repository.tables.records.TRepositoryGtiTokenRecord;
import com.tencent.devops.model.repository.tables.records.TRepositoryRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>devops_repository</code> 
 * schema
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TRepositoryRecord, Long> IDENTITY_T_REPOSITORY = Identities0.IDENTITY_T_REPOSITORY;
    public static final Identity<TRepositoryCommitRecord, Long> IDENTITY_T_REPOSITORY_COMMIT = Identities0.IDENTITY_T_REPOSITORY_COMMIT;
    public static final Identity<TRepositoryGithubTokenRecord, Long> IDENTITY_T_REPOSITORY_GITHUB_TOKEN = Identities0.IDENTITY_T_REPOSITORY_GITHUB_TOKEN;
    public static final Identity<TRepositoryGithubWhitelistRecord, Long> IDENTITY_T_REPOSITORY_GITHUB_WHITELIST = Identities0.IDENTITY_T_REPOSITORY_GITHUB_WHITELIST;
    public static final Identity<TRepositoryGtiTokenRecord, Long> IDENTITY_T_REPOSITORY_GTI_TOKEN = Identities0.IDENTITY_T_REPOSITORY_GTI_TOKEN;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TRepositoryRecord> KEY_T_REPOSITORY_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_PRIMARY;
    public static final UniqueKey<TRepositoryCodeGitRecord> KEY_T_REPOSITORY_CODE_GIT_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_CODE_GIT_PRIMARY;
    public static final UniqueKey<TRepositoryCodeGitlabRecord> KEY_T_REPOSITORY_CODE_GITLAB_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_CODE_GITLAB_PRIMARY;
    public static final UniqueKey<TRepositoryCodeP4Record> KEY_T_REPOSITORY_CODE_P4_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_CODE_P4_PRIMARY;
    public static final UniqueKey<TRepositoryCodeSvnRecord> KEY_T_REPOSITORY_CODE_SVN_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_CODE_SVN_PRIMARY;
    public static final UniqueKey<TRepositoryCommitRecord> KEY_T_REPOSITORY_COMMIT_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_COMMIT_PRIMARY;
    public static final UniqueKey<TRepositoryCommitRecord> KEY_T_REPOSITORY_COMMIT_PIPELINE_REPO_KEY = UniqueKeys0.KEY_T_REPOSITORY_COMMIT_PIPELINE_REPO_KEY;
    public static final UniqueKey<TRepositoryGithubRecord> KEY_T_REPOSITORY_GITHUB_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_GITHUB_PRIMARY;
    public static final UniqueKey<TRepositoryGithubTokenRecord> KEY_T_REPOSITORY_GITHUB_TOKEN_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_GITHUB_TOKEN_PRIMARY;
    public static final UniqueKey<TRepositoryGithubTokenRecord> KEY_T_REPOSITORY_GITHUB_TOKEN_USER_ID = UniqueKeys0.KEY_T_REPOSITORY_GITHUB_TOKEN_USER_ID;
    public static final UniqueKey<TRepositoryGithubWhitelistRecord> KEY_T_REPOSITORY_GITHUB_WHITELIST_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_GITHUB_WHITELIST_PRIMARY;
    public static final UniqueKey<TRepositoryGtiTokenRecord> KEY_T_REPOSITORY_GTI_TOKEN_PRIMARY = UniqueKeys0.KEY_T_REPOSITORY_GTI_TOKEN_PRIMARY;
    public static final UniqueKey<TRepositoryGtiTokenRecord> KEY_T_REPOSITORY_GTI_TOKEN_USER_ID = UniqueKeys0.KEY_T_REPOSITORY_GTI_TOKEN_USER_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<TRepositoryRecord, Long> IDENTITY_T_REPOSITORY = createIdentity(TRepository.T_REPOSITORY, TRepository.T_REPOSITORY.REPOSITORY_ID);
        public static Identity<TRepositoryCommitRecord, Long> IDENTITY_T_REPOSITORY_COMMIT = createIdentity(TRepositoryCommit.T_REPOSITORY_COMMIT, TRepositoryCommit.T_REPOSITORY_COMMIT.ID);
        public static Identity<TRepositoryGithubTokenRecord, Long> IDENTITY_T_REPOSITORY_GITHUB_TOKEN = createIdentity(TRepositoryGithubToken.T_REPOSITORY_GITHUB_TOKEN, TRepositoryGithubToken.T_REPOSITORY_GITHUB_TOKEN.ID);
        public static Identity<TRepositoryGithubWhitelistRecord, Long> IDENTITY_T_REPOSITORY_GITHUB_WHITELIST = createIdentity(TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST, TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST.ID);
        public static Identity<TRepositoryGtiTokenRecord, Long> IDENTITY_T_REPOSITORY_GTI_TOKEN = createIdentity(TRepositoryGtiToken.T_REPOSITORY_GTI_TOKEN, TRepositoryGtiToken.T_REPOSITORY_GTI_TOKEN.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<TRepositoryRecord> KEY_T_REPOSITORY_PRIMARY = createUniqueKey(TRepository.T_REPOSITORY, "KEY_T_REPOSITORY_PRIMARY", TRepository.T_REPOSITORY.REPOSITORY_ID);
        public static final UniqueKey<TRepositoryCodeGitRecord> KEY_T_REPOSITORY_CODE_GIT_PRIMARY = createUniqueKey(TRepositoryCodeGit.T_REPOSITORY_CODE_GIT, "KEY_T_REPOSITORY_CODE_GIT_PRIMARY", TRepositoryCodeGit.T_REPOSITORY_CODE_GIT.REPOSITORY_ID);
        public static final UniqueKey<TRepositoryCodeGitlabRecord> KEY_T_REPOSITORY_CODE_GITLAB_PRIMARY = createUniqueKey(TRepositoryCodeGitlab.T_REPOSITORY_CODE_GITLAB, "KEY_T_REPOSITORY_CODE_GITLAB_PRIMARY", TRepositoryCodeGitlab.T_REPOSITORY_CODE_GITLAB.REPOSITORY_ID);
        public static final UniqueKey<TRepositoryCodeP4Record> KEY_T_REPOSITORY_CODE_P4_PRIMARY = createUniqueKey(TRepositoryCodeP4.T_REPOSITORY_CODE_P4, "KEY_T_REPOSITORY_CODE_P4_PRIMARY", TRepositoryCodeP4.T_REPOSITORY_CODE_P4.REPOSITORY_ID);
        public static final UniqueKey<TRepositoryCodeSvnRecord> KEY_T_REPOSITORY_CODE_SVN_PRIMARY = createUniqueKey(TRepositoryCodeSvn.T_REPOSITORY_CODE_SVN, "KEY_T_REPOSITORY_CODE_SVN_PRIMARY", TRepositoryCodeSvn.T_REPOSITORY_CODE_SVN.REPOSITORY_ID);
        public static final UniqueKey<TRepositoryCommitRecord> KEY_T_REPOSITORY_COMMIT_PRIMARY = createUniqueKey(TRepositoryCommit.T_REPOSITORY_COMMIT, "KEY_T_REPOSITORY_COMMIT_PRIMARY", TRepositoryCommit.T_REPOSITORY_COMMIT.ID);
        public static final UniqueKey<TRepositoryCommitRecord> KEY_T_REPOSITORY_COMMIT_PIPELINE_REPO_KEY = createUniqueKey(TRepositoryCommit.T_REPOSITORY_COMMIT, "KEY_T_REPOSITORY_COMMIT_PIPELINE_REPO_KEY", TRepositoryCommit.T_REPOSITORY_COMMIT.PIPELINE_ID, TRepositoryCommit.T_REPOSITORY_COMMIT.BUILD_ID);
        public static final UniqueKey<TRepositoryGithubRecord> KEY_T_REPOSITORY_GITHUB_PRIMARY = createUniqueKey(TRepositoryGithub.T_REPOSITORY_GITHUB, "KEY_T_REPOSITORY_GITHUB_PRIMARY", TRepositoryGithub.T_REPOSITORY_GITHUB.REPOSITORY_ID);
        public static final UniqueKey<TRepositoryGithubTokenRecord> KEY_T_REPOSITORY_GITHUB_TOKEN_PRIMARY = createUniqueKey(TRepositoryGithubToken.T_REPOSITORY_GITHUB_TOKEN, "KEY_T_REPOSITORY_GITHUB_TOKEN_PRIMARY", TRepositoryGithubToken.T_REPOSITORY_GITHUB_TOKEN.ID);
        public static final UniqueKey<TRepositoryGithubTokenRecord> KEY_T_REPOSITORY_GITHUB_TOKEN_USER_ID = createUniqueKey(TRepositoryGithubToken.T_REPOSITORY_GITHUB_TOKEN, "KEY_T_REPOSITORY_GITHUB_TOKEN_USER_ID", TRepositoryGithubToken.T_REPOSITORY_GITHUB_TOKEN.USER_ID);
        public static final UniqueKey<TRepositoryGithubWhitelistRecord> KEY_T_REPOSITORY_GITHUB_WHITELIST_PRIMARY = createUniqueKey(TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST, "KEY_T_REPOSITORY_GITHUB_WHITELIST_PRIMARY", TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST.ID);
        public static final UniqueKey<TRepositoryGtiTokenRecord> KEY_T_REPOSITORY_GTI_TOKEN_PRIMARY = createUniqueKey(TRepositoryGtiToken.T_REPOSITORY_GTI_TOKEN, "KEY_T_REPOSITORY_GTI_TOKEN_PRIMARY", TRepositoryGtiToken.T_REPOSITORY_GTI_TOKEN.ID);
        public static final UniqueKey<TRepositoryGtiTokenRecord> KEY_T_REPOSITORY_GTI_TOKEN_USER_ID = createUniqueKey(TRepositoryGtiToken.T_REPOSITORY_GTI_TOKEN, "KEY_T_REPOSITORY_GTI_TOKEN_USER_ID", TRepositoryGtiToken.T_REPOSITORY_GTI_TOKEN.USER_ID);
    }
}
