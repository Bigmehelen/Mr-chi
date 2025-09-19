package org.semicolon.semicolonartworksystem.controllers;

import org.semicolon.semicolonartworksystem.dtos.requests.CreateArtworkRequest;
import org.semicolon.semicolonartworksystem.dtos.responses.CreateArtworkResponse;
import org.semicolon.semicolonartworksystem.services.ManagementImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/require")
@CrossOrigin("*")
public class ArtworkController {

    @Autowired
    private ManagementImpl managementImpl;

    @PostMapping("/entry")
    public CreateArtworkResponse addArtwork(@RequestBody CreateArtworkRequest request) {
        return managementImpl.addArtwork(request);
    }

    @GetMapping("/find-all")
    public List<CreateArtworkResponse> findAllArtworks() {
        return managementImpl.findAllArtwork();
    }

    @PostMapping("/remove/{id}")
    public void deleteArtworksById(@PathVariable String id) {
        managementImpl.deleteArtworkById(id);
    }

    @GetMapping("/find/{id}")
    public CreateArtworkResponse findArtworkById(@PathVariable String id) {
        return managementImpl.findArtworkById(id);
    }
}
