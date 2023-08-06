package com.epicode.esercizi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.esercizi.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}
