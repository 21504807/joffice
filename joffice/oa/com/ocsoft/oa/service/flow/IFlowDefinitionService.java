package com.ocsoft.oa.service.flow;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.activiti.engine.impl.task.TaskDefinition;
import org.springframework.web.multipart.MultipartFile;

import com.ocsoft.core.service.IBaseService;
import com.ocsoft.oa.vo.flow.FlowDefinition;

public interface IFlowDefinitionService extends
		IBaseService<FlowDefinition, Long> 
{
	public Map getFlowDefList(Map<String,String> params);
	public void deploy(MultipartFile mFile, String flowDefDir, String user);
	public FlowDefinition getByKey(String key);
	public Collection<TaskDefinition> getTaskDef(String processDefId);
	public List getActivityList(String processDefId);
}
