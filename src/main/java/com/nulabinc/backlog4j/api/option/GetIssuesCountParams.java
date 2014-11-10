package com.nulabinc.backlog4j.api.option;

import com.nulabinc.backlog4j.BacklogAPIException;
import com.nulabinc.backlog4j.BacklogException;
import com.nulabinc.backlog4j.Issue;
import com.nulabinc.backlog4j.http.NameValuePair;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * Parameters for get issue API.
 *
 * @author nulab-inc
 */
public class GetIssuesCountParams extends GetParams {

    public enum ParentChildType {
        All(1), NotChild(1), Child(2), NotChildNotParent(3), Parent(4);

        ParentChildType(int intValue) {
            this.intValue = intValue;
        }

        public int getIntValue() {
            return intValue;
        }

        private int intValue;
    }

    public GetIssuesCountParams(List<Long> projectIds){
        for (Long projectId :projectIds) {
            parameters.add(new NameValuePair("projectId[]", projectId.toString()));
        }
    }

    public GetIssuesCountParams projectIds(List<Long> projectIds) {
        for (Long projectId :projectIds) {
            parameters.add(new NameValuePair("projectId[]", projectId.toString()));
        }
        return this;
    }

    public GetIssuesCountParams issueTypeIds(List<Long> issueTypeIds) {
        for (Long issueTypeId :issueTypeIds) {
            parameters.add(new NameValuePair("issueTypeId[]", issueTypeId.toString()));
        }
        return this;
    }

    public GetIssuesCountParams categoryIds(List<Long> categoryIds) {
        for (Long categoryId :categoryIds) {
            parameters.add(new NameValuePair("categoryId[]", categoryId.toString()));
        }
        return this;
    }

    public GetIssuesCountParams versionIds(List<Long> versionIds) {
        for (Long versionId :versionIds) {
            parameters.add(new NameValuePair("versionId[]", versionId.toString()));
        }
        return this;
    }

    public GetIssuesCountParams milestoneIds(List<Long> milestoneIds) {
        for (Long milestoneId :milestoneIds) {
            parameters.add(new NameValuePair("milestoneId[]", milestoneId.toString()));
        }
        return this;
    }

    public GetIssuesCountParams statuses(List<Issue.StatusType> statuses) {
        for (Issue.StatusType status :statuses) {
            parameters.add(new NameValuePair("statusId[]", String.valueOf(status.getIntValue())));
        }
        return this;
    }

    public GetIssuesCountParams priorities(List<Issue.PriorityType> priorities) {
        for (Issue.PriorityType priority :priorities) {
            parameters.add(new NameValuePair("priorityId[]", String.valueOf(priority.getIntValue())));
        }
        return this;
    }

    public GetIssuesCountParams assignerIds(List<Long> assignerIds) {
        for (Long assignerId :assignerIds) {
            parameters.add(new NameValuePair("assigneeId[]", assignerId.toString()));
        }
        return this;
    }

    public GetIssuesCountParams createdUserIds(List<Long> createdUserIds) {
        for (Long createdUserId :createdUserIds) {
            parameters.add(new NameValuePair("createdUserId[]", createdUserId.toString()));
        }
        return this;
    }

    public GetIssuesCountParams resolutions(List<Issue.ResolutionType> resolutions) {
        for (Issue.ResolutionType resolution :resolutions) {
            parameters.add(new NameValuePair("resolutionId[]", String.valueOf(resolution.getIntValue())));
        }
        return this;
    }

    public GetIssuesCountParams parentChildType(ParentChildType parentChildType) {
        parameters.add(new NameValuePair("parentChild", String.valueOf(parentChildType.getIntValue())));
        return this;
    }

    public GetIssuesCountParams attachment(boolean attachment) {
        parameters.add(new NameValuePair("attachment", String.valueOf(attachment)));
        return this;
    }

    public GetIssuesCountParams sharedFile(boolean sharedFile) {
        parameters.add(new NameValuePair("sharedFile", String.valueOf(sharedFile)));
        return this;
    }

    public GetIssuesCountParams createdSince(String createdSince) {
        parameters.add(new NameValuePair("createdSince", createdSince));
        return this;
    }

    public GetIssuesCountParams createdUntil(String createdUntil) {
        parameters.add(new NameValuePair("createdUntil", createdUntil));
        return this;
    }

    public GetIssuesCountParams updatedSince(String updatedSince) {
        parameters.add(new NameValuePair("updatedSince", updatedSince));
        return this;
    }

    public GetIssuesCountParams updatedUntil(String updatedUntil) {
        parameters.add(new NameValuePair("updatedUntil", updatedUntil));
        return this;
    }

    public GetIssuesCountParams startDateSince(String startDateSince) {
        parameters.add(new NameValuePair("startDateSince", startDateSince));
        return this;
    }

    public GetIssuesCountParams startDateUntil(String startDateUntil) {
        parameters.add(new NameValuePair("startDateUntil", startDateUntil));
        return this;
    }

    public GetIssuesCountParams dueDateSince(String dueDateSince) {
        parameters.add(new NameValuePair("dueDateSince", dueDateSince));
        return this;
    }

    public GetIssuesCountParams dueDateUntil(String dueDateUntil) {
        parameters.add(new NameValuePair("dueDateUntil", dueDateUntil));
        return this;
    }

    public GetIssuesCountParams parentIssueIds(List<Long> parentIssueIds) {
        for (Long parentIssueId :parentIssueIds) {
            parameters.add(new NameValuePair("parentIssueId[]", parentIssueId.toString()));
        }
        return this;
    }

    public GetIssuesCountParams keyword(String keyword) throws BacklogException {
        try {
            parameters.add(new NameValuePair("keyword", URLEncoder.encode(keyword, "utf-8")));
        } catch (UnsupportedEncodingException e) {
            throw new BacklogAPIException(e);
        }
        return this;
    }
}