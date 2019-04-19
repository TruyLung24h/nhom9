package bootsample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.TinTucRepository;
import bootsample.model.TinTuc;

@Service
@Transactional
public class TinTucService {

	private final TinTucRepository tintucRepository;

	public TinTucService(TinTucRepository tintucRepository) {
		this.tintucRepository = tintucRepository;
	}
	
	public List<TinTuc> findAll(){
		List<TinTuc> tintucs = new ArrayList<>();
		for(TinTuc tintuc : tintucRepository.findAll()){
			tintucs.add(tintuc);
		}
		return tintucs;
	}
	
	
	public TinTuc findTinTuc(int id){
		TinTuc tintucs = new TinTuc();
		for(TinTuc tintuc : tintucRepository.findAll()){
			if(tintuc.getMatintuc()==id)
			{			
				return tintuc;
			}				
		}
		return tintucs;
	}	
	public Object findTinTuc1(int matintuc){
		return tintucRepository.findById(matintuc);
		
	}
	public void save(TinTuc tintuc){
		tintucRepository.save(tintuc);
	}
	public void delete(int matintuc){
		tintucRepository.deleteById(matintuc);
	}
}
