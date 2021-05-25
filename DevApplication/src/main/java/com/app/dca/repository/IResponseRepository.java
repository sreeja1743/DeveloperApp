package com.app.dca.repository;

import java.util.List;

import com.app.dca.entity.Response;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;
import com.app.dca.exception.UnknownResponseException;

public interface IResponseRepository {
	
	Response saveResponse(Response resp);
	
	Response updateResponse(Response resp);
	
	Response removeResponse(int respId) throws UnknownResponseException;
	
	Response likeResponse(int respId);
	
	List<Response> fetchResponseByFeed(int feedId) throws UnknownFeedException;
	
	List<Response> fetchResponseByDeveloper(int devId) throws UnknownDeveloperException;
}
