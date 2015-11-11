package pe.com.implast.logic.service.imp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.implast.logic.service.ParteProduccionBUS;
import pe.com.implast.model.dao.ParteProduccionDAO;
import pe.com.implast.model.dao.imp.ParteProduccionDAOImpl;

public class ParteProduccionBUSImpl implements ParteProduccionBUS {

	private static final Logger LOG=LoggerFactory.getLogger(ParteProduccionBUSImpl.class);
	
	ParteProduccionDAO parteProduccionDAO=new ParteProduccionDAOImpl();
	
	public void getNumeroParte(String idNumeroParte) {
		try{
			parteProduccionDAO.getNumeroParte(idNumeroParte);
		} catch(Exception e){
		
		}
	}

	public List<String> numerosParte() {
		
		return null;
	}

}
