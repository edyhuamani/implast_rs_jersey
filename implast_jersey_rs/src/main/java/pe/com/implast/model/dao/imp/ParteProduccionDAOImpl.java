package pe.com.implast.model.dao.imp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.implast.model.dao.ParteProduccionDAO;

public class ParteProduccionDAOImpl implements ParteProduccionDAO {

	private static final Logger LOG=LoggerFactory.getLogger(ParteProduccionDAOImpl.class);
	
	public void getNumeroParte(String idNumeroParte) {
		try{
			
		}catch (Exception e){
			LOG.error(e.getMessage(), e);
		}
		
	}

}
