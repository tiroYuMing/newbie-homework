package com.cathaybk.newbiehomework.service;

import com.cathaybk.newbiehomework.model.dto.CoinDeskFullDataDto;
import com.cathaybk.newbiehomework.model.dto.CoinDeskSampleDataDto;
import com.cathaybk.newbiehomework.model.dto.CurrencyDataDto;
import com.cathaybk.newbiehomework.model.dto.CurrencyDto;

import java.util.List;

public interface CurrencyService {

    List<CurrencyDataDto> getCurrencies();

    CurrencyDataDto getCurrencyByCode(String currencyCode);

    void deleteCurrency(String currencyCode);

    CurrencyDataDto updateCurrency(String currencyCode, CurrencyDto data);

    CurrencyDataDto addCurrency(CurrencyDto data);

    CoinDeskFullDataDto getFullCoinData() throws Exception;

    CoinDeskSampleDataDto getSampleCoinData() throws Exception;
}
