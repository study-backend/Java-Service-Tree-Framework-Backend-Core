/*
 * @author Dongmin.lee
 * @since 2023-03-21
 * @version 23.03.21
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.arms.jiraissuelog.controller;

import com.arms.jiraissuelog.model.JiraIssueLogDTO;
import com.arms.jiraissuepriority.model.JiraIssuePriorityEntity;
import com.egovframework.javaservice.treeframework.controller.TreeAbstractController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

import com.arms.jiraissuelog.model.JiraIssueLogEntity;
import com.arms.jiraissuelog.service.JiraIssueLog;

@Slf4j
@Controller
@RequestMapping(value = {"/arms/jiraIssueLog"})
public class JiraIssueLogController extends TreeAbstractController<JiraIssueLog, JiraIssueLogDTO, JiraIssueLogEntity> {

    @Autowired
    @Qualifier("jiraIssueLog")
    private JiraIssueLog jiraIssueLog;

    @PostConstruct
    public void initialize() {
        setTreeService(jiraIssueLog);
        setTreeEntity(JiraIssueLogEntity.class);
    }

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

}
