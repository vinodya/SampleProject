package com.hms.SampleProject;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @RequestMapping("/sample")
    public SampleResponse sample(@RequestParam (value = "name", defaultValue = "robot") String name){
        SampleResponse response = new SampleResponse();
            response.setId(1);
            response.setMessage("Your name is : " + name);
            return response;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public PostResponse Test(@RequestBody PostRequest inputPayload) {
        PostResponse response = new PostResponse();
        response.setId(inputPayload.getId() * 100);
        response.setMessage("Hello " + inputPayload.getName());
        response.setExtra("Some text");
        return response;
    }
}
