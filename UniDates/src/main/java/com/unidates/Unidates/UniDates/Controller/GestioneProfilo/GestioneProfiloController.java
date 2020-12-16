package com.unidates.Unidates.UniDates.Controller.GestioneProfilo;

import com.unidates.Unidates.UniDates.Model.Entity.GestioneProfilo.Foto;
import com.unidates.Unidates.UniDates.Model.Entity.GestioneProfilo.Profilo;
import com.unidates.Unidates.UniDates.Service.GestioneProfilo.FotoService;
import com.unidates.Unidates.UniDates.Service.GestioneProfilo.ProfiloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/ProfileManager")
public class GestioneProfiloController {

    @Autowired
    ProfiloService profiloService;

    @Autowired
    FotoService fotoService;

    @RequestMapping("/addFoto")
    public void addFoto(Profilo profilo, Foto foto){
        fotoService.addFoto(profilo, foto);
    }

    @RequestMapping("/deleteFoto")
    public void deleteFoto(Foto foto){
        fotoService.deleteFoto(foto);
    }

    @RequestMapping("/deleteProfile")
    public void deleteProfile(Profilo profilo){
        profiloService.deleteProfile(profilo);
    }

    @RequestMapping("/editProfile")
    public void updateProfile(Profilo profilo){
        profiloService.updateProfile(profilo);
    }




}
