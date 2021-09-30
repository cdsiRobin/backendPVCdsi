package com.cdsi.backend.inve;

import com.cdsi.backend.inve.models.services.IArcgtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/arcgtc")
public class ArcgtcController {
    @Autowired
    private IArcgtcService arcgtcService;


}
