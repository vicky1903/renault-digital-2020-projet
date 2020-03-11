package com.renault.servlets;

import com.renault.model.Car;
import com.renault.service.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import java.util.List;

@RestController
@RequestMapping("/cars")
@CrossOrigin
public class CarsController extends HttpServlet {

  @Autowired
  private CarsRepository carsRepository;

  @GetMapping("/{brand}")
  public List<Car> get(@PathVariable("brand") String brand) {
    return carsRepository.findByBrand(brand);
  }



}
