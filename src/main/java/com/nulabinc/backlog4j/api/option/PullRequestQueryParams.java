package com.nulabinc.backlog4j.api.option;

import com.nulabinc.backlog4j.PullRequest;
import com.nulabinc.backlog4j.http.NameValuePair;

import java.util.List;

/**
 * Parameters for pull request query.
 *
 * @author nulab-inc
 */
public class PullRequestQueryParams extends QueryParams {

    public PullRequestQueryParams statusType(List<PullRequest.StatusType> statusType) {
        for (PullRequest.StatusType type : statusType) {
            parameters.add(new NameValuePair("statusId[]", String.valueOf(type.getIntValue())));
        }
        return this;
    }

    public PullRequestQueryParams assigneeIds(List assigneeIds) {
        for (Object assigneeId : assigneeIds) {
            parameters.add(new NameValuePair("assigneeId[]", assigneeId.toString()));
        }
        return this;
    }

    public PullRequestQueryParams issueIds(List issueIds) {
        for (Object issueId : issueIds) {
            parameters.add(new NameValuePair("issueId[]", issueId.toString()));
        }
        return this;
    }

    public PullRequestQueryParams createdUserIds(List createdUserIds) {
        for (Object createdUserId : createdUserIds) {
            parameters.add(new NameValuePair("createdUserId[]", createdUserId.toString()));
        }
        return this;
    }

    @Override
    public PullRequestQueryParams minId(Object minId) {
        return (PullRequestQueryParams) super.minId(minId);
    }

    @Override
    public PullRequestQueryParams maxId(Object maxId) {
        return (PullRequestQueryParams) super.maxId(maxId);
    }

    @Override
    public PullRequestQueryParams count(long count) {
        return (PullRequestQueryParams) super.count(count);
    }

    @Override
    public PullRequestQueryParams count(int count) {
        return (PullRequestQueryParams) super.count(count);
    }

    @Override
    public PullRequestQueryParams order(Order order) {
        return (PullRequestQueryParams) super.order(order);
    }

    public PullRequestQueryParams offset(long offset) {
        parameters.add(new NameValuePair("offset", String.valueOf(offset)));
        return this;
    }

    public PullRequestQueryParams offset(int offset) {
        parameters.add(new NameValuePair("offset", String.valueOf(offset)));
        return this;
    }
}
