var indexdata = 
[
	{ isexpand: "false", text: "废水污染源自动监控", children: [
        { isexpand: "false", text: "实时监控", children: [
		    { url: "navigation_html/First/1-RealTimeMonitoring/OnlineTable.jsp", text: "在线列表" }
	    ] 
        },
         {
             isexpand: "false", text: "报警管理", children: [
              { url: "browseAlarmlogging.action", text: "报警日志" },
			  { url: "browseAlarmRegular.action", text: "报警规则" },
			  { url: "navigation_html/First/2-Alarm/MessageNotice.html", text: "短信设置" },
			  { url: "navigation_html/First/2-Alarm/AlarmInstruct.html", text: "报警指令" }
             ]
         },
          {
              isexpand: "false", text: "审核管理", children: [ 
             { url: "navigation_html/First/3-Audit/AuditData.html", text: "审核数据" },
             { url: "navigation_html/First/3-Audit/AuditRule.html", text: "审核规则" },
			 { url: "navigation_html/First/3-Audit/AuditLog.html", text: "审核日志" },
			 { url: "navigation_html/First/3-Audit/DataGeneration.html", text: "数据生成" },
			 { url: "navigation_html/First/3-Audit/AuditResult.html", text: "审核结果" }
              ]
          },
	    {isexpand:"false",text:"综合查询",children:[ 
		    {url:"navigation_html/First/4-SynthesizeQuery/MonitorDataQuery.html",text:"监测数据查询"}, 
		     {url:"navigation_html/First/4-SynthesizeQuery/StatementDataQuery.html",text:"报表数据查询"}
	    ]}, 
	    {isexpand:"false",text:"报表统计",children:[ 
		    {url:"navigation_html/First/5-Statement/#",text:"排放统计月报"}, 
		    { url: "navigation_html/First/5-Statement/#", text: "企业排放情况统计" }, 
		    {url:"navigation_html/First/5-Statement/#",text:"污水处理厂情况统计"},
		    {url:"navigation_html/First/5-Statement/#",text:"企业污染物排放统计"},
		    {url:"navigation_html/First/5-Statement/#",text:"污水厂污染物排放统计"},
		    {url:"navigation_html/First/5-Statement/#",text:"企业废水排放统计"},
		    {url:"navigation_html/First/5-Statement/#",text:"企业超标统计（瞬时值）"},
		    {url:"navigation_html/First/5-Statement/#",text:"企业超标统计（日均值）"},
		    {url:"navigation_html/First/5-Statement/#",text:"污水厂超标统计（瞬时值）"},
		    {url:"navigation_html/First/5-Statement/#",text:"污水厂超标统计（日均值）"},
		    {url:"navigation_html/First/5-Statement/#",text:"在线监测数据审核报告"},
		    {isexpend:"false",text:"其他",children:[
              {url:"navigation_html/First/5-Statement/#",text:"排放统计月报-小时"}                                    
		    ]}
	    ]},
	    {isexpand:"false",text:"邮件管理",children:[ 
            {url:"browseMail.action",text:"发信箱"}, 
	        {url:"browseWriteMail.action",text:"写邮件"},
	        {url:"browseContacts.action", text: "通讯簿"},
	        {url:"setMail.action",text:"邮件设置"}
	     ]},
	    {isexpand:"false",text:"运行维护",children:[ 
            {isexpand:"false",text:"运维统计",children:[ 
	           {url:"navigation_html/First/7-RunMaintain/#",text:"在线率概况"}, 
	           {url:"navigation_html/First/7-RunMaintain/#",text:"测点在线率详情"},
	           {url:"navigation_html/First/7-RunMaintain/#",text:"数据采样统计"}
	        ]},
	        {isexpand:"false",text:"运维配置",children:[ 
	           {url:"navigation_html/First/7-RunMaintain/#",text:"维护组配置"},
	           {url:"navigation_html/First/7-RunMaintain/#",text:"维护类型配置"},
	           {url:"navigation_html/First/7-RunMaintain/#",text:"运行日历设置"},
	           {url:"navigation_html/First/7-RunMaintain/#",text:"仪器运行率标准"}
	        ]}
	    ]}, 
	    {isexpand:"false",text:"上报管理",children:[ 
	       {url:"navigation_html/First/8-ReportManage/#",text:"上报查询"}, 
	       {url:"navigation_html/First/8-ReportManage/#",text:"上报设置"},
	       {url:"navigation_html/First/8-ReportManage/#",text:"上报日志"}
	    ]} 
    ]},
    {isexpand:"false",text:"污染源信息管理",children:[   
	    {url:"browseEnt_view.action",text:"企业信息管理"},
		{url:"browseOutfall_view.action",text:"排水口管理"},
		{url:"browseInlet.action",text:"进水口管理"},
		{url:"browseSCY_view.action",text:"数采仪管理"},
		{url:"navigation_html/Second/O&I_Set.html",text:"进排口设置"}
    ]},
    {isexpand:"false",text:"污染源自动采样",children:[ 
	    { url: "navigation_html/First/1-RealTimeMonitoring/OnlineTable.jsp", text: "在线列表" },
	    {isexpand:"false",text:"采样控制",children:[   
	        {url:"navigation_html/Thirdly/1-SamplingControl/#",text:"远程控制"},
	        {url:"navigation_html/Thirdly/1-SamplingControl/#",text:"采样计划"},
	        {url:"navigation_html/Thirdly/1-SamplingControl/#",text:"超标采样标准"},
	        {url:"navigation_html/Thirdly/1-SamplingControl/#",text:"采样任务查询"},
	        {url:"navigation_html/Thirdly/1-SamplingControl/#",text:"采样任务下达"}
	    ]},
	    {isexpand:"false",text:"报警管理",children:[ 
	        {url:"navigation_html/Thirdly/2-Alarm/#",text:"报警日志"},    
	        {url:"navigation_html/Thirdly/2-Alarm/#",text:"门禁管理"}
	    ]},
	    {isexpand:"false",text:"分析统计",children:[ 
	        {url:"navigation_html/Thirdly/3-AnalyticStatistics/#",text:"月报"},    
	        {url:"navigation_html/Thirdly/3-AnalyticStatistics/#",text:"季报"},
	        {url:"navigation_html/Thirdly/3-AnalyticStatistics/#",text:"自定义报表"},
	        {url:"navigation_html/Thirdly/3-AnalyticStatistics/#",text:"采样数据"} 
	    ]},
	    {isexpand:"false",text:"分析统计",children:[ 
	        {url:"navigation_html/Thirdly/3-AnalyticStatistics/#",text:"月报"},    
	        {url:"navigation_html/Thirdly/3-AnalyticStatistics/#",text:"季报"},
	        {url:"navigation_html/Thirdly/3-AnalyticStatistics/#",text:"自定义报表"},
	        {url:"navigation_html/Thirdly/3-AnalyticStatistics/#",text:"采样数据"} 
	    ]},
    ]},
    {
        isexpand: "false", text: "系统管理", children: [
            { url: "demos/portal/portal.htm", text: "默认" },
           { url: "demos/portal/panel.htm", text: "panel" },
               { url: "demos/portal/panel-event.htm", text: "panel事件支持" },
           { url: "demos/portal/portal-columns.htm", text: "columns" },
           { url: "demos/portal/portal-cookie.htm", text: "记忆" },
           { url: "demos/portal/portal-drag.htm", text: "可拖动" },
           { url: "demos/portal/portal-get.htm", text: "方法" },
           { url: "demos/portal/portal-url.htm", text: "载入页面" },
            { url: "demos/portal/portal-rows-url.htm", text: "通过url载入模型" },
           { url: "demos/portal/portal-inject.htm", text: "html启动模式" },
           { url: "demos/portal/portal-method.htm", text: "方法2" }
        ]
    }
];


var indexdata2 =
[
    { isexpand: "true", text: "表格", children: [
        { isexpand: "true", text: "可排序", children: [
		    { url: "dotnetdemos/grid/sortable/client.aspx", text: "客户端" },
            { url: "dotnetdemos/grid/sortable/server.aspx", text: "服务器" }
	    ]
        },
        { isexpand: "true", text: "可分页", children: [
		    { url: "dotnetdemos/grid/pager/client.aspx", text: "客户端" },
            { url: "dotnetdemos/grid/pager/server.aspx", text: "服务器" },
            { url: "dotnetdemos/grid/pager/server_scroll.aspx", text: "滚动分页" }
	    ]
        },
        { isexpand: "true", text: "树表格", children: [
		    { url: "dotnetdemos/grid/treegrid/tree.aspx", text: "树表格" }, 
		    { url: "dotnetdemos/grid/treegrid/tree2.aspx", text: "树表格2" }
	    ]
        }
    ]
    }
];
