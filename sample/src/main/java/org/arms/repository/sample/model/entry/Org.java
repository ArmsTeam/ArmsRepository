package org.arms.repository.sample.model.entry;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ArmsTeam on 2017/10/5.
 */

public class Org {

    /**
     * login : ArmsTeam
     * id : 31231906
     * url : https://api.github.com/orgs/ArmsTeam
     * repos_url : https://api.github.com/orgs/ArmsTeam/repos
     * events_url : https://api.github.com/orgs/ArmsTeam/events
     * hooks_url : https://api.github.com/orgs/ArmsTeam/hooks
     * issues_url : https://api.github.com/orgs/ArmsTeam/issues
     * members_url : https://api.github.com/orgs/ArmsTeam/members{/member}
     * public_members_url : https://api.github.com/orgs/ArmsTeam/public_members{/member}
     * avatar_url : https://avatars1.githubusercontent.com/u/31231906?v=4
     * description : Arms Open Source
     * name :
     * company : null
     * blog :
     * location : Chengdu,China
     * email :
     * has_organization_projects : true
     * has_repository_projects : true
     * public_repos : 2
     * public_gists : 0
     * followers : 0
     * following : 0
     * html_url : https://github.com/ArmsTeam
     * created_at : 2017-08-22T03:40:24Z
     * updated_at : 2017-09-09T16:02:43Z
     * type : Organization
     */

    private String login;
    private int id;
    private String url;
    @SerializedName("repos_url")
    private String reposUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("hooks_url")
    private String hooksUrl;
    @SerializedName("issues_url")
    private String issuesUrl;
    @SerializedName("members_url")
    private String membersUrl;
    @SerializedName("public_members_url")
    private String publicMembersUrl;
    @SerializedName("avatar_url")
    private String avatarUrl;
    private String description;
    private String name;
    private Object company;
    private String blog;
    private String location;
    private String email;
    @SerializedName("has_organization_projects")
    private boolean hasOrganizationProjects;
    @SerializedName("has_repository_projects")
    private boolean hasRepositoryProjects;
    @SerializedName("public_repos")
    private int publicRepos;
    @SerializedName("public_gists")
    private int publicGists;
    private int followers;
    private int following;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    private String type;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public String getPublicMembersUrl() {
        return publicMembersUrl;
    }

    public void setPublicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasOrganizationProjects() {
        return hasOrganizationProjects;
    }

    public void setHasOrganizationProjects(boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
    }

    public boolean isHasRepositoryProjects() {
        return hasRepositoryProjects;
    }

    public void setHasRepositoryProjects(boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
    }

    public int getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(int publicRepos) {
        this.publicRepos = publicRepos;
    }

    public int getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(int publicGists) {
        this.publicGists = publicGists;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
