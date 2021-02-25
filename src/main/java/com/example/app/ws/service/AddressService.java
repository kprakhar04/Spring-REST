package com.example.app.ws.service;

import java.util.List;

import com.example.app.ws.shared.dto.AddressDto;

public interface AddressService {

	List<AddressDto> getAddresses(String userId);

	AddressDto getAddress(String addressId);
}
