/*
 * @author Dongmin.lee
 * @since 2023-03-28
 * @version 23.03.28
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.arms.jiraserver.controller;

import com.arms.jiraserver.model.JiraServerDTO;
import com.arms.jiraserverlog.model.JiraServerLogEntity;
import com.egovframework.javaservice.treeframework.controller.TreeAbstractController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

import com.arms.jiraserver.model.JiraServerEntity;
import com.arms.jiraserver.service.JiraServer;

@Slf4j
@Controller
@RequestMapping(value = {"/arms/jiraServer"})
public class JiraServerController extends TreeAbstractController<JiraServer, JiraServerDTO, JiraServerEntity> {

    @Autowired
    @Qualifier("jiraServer")
    private JiraServer jiraServer;

    @PostConstruct
    public void initialize() {
        setTreeService(jiraServer);
        setTreeEntity(JiraServerEntity.class);
    }

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

}
