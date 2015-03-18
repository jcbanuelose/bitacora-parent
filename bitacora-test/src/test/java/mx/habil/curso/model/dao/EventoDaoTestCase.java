package mx.habil.curso.model.dao;

import lombok.extern.apachecommons.CommonsLog;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@CommonsLog
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
			"classpath:mx/habil/curso/commons/xml/commons.application.context.xml",
			"classpath:mx/habil/curso/model/xml/model.application.context.xml"
		})
public class EventoDaoTestCase {
	@Autowired EventoDao eventoDao;
	
	@Before public void initi(){
		log.debug("<-- Begin -->");
		log.debug("<-- Finalize -->");
	}
}
