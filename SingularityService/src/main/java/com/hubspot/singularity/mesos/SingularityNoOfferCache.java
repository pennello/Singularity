package com.hubspot.singularity.mesos;

import java.util.Collections;
import java.util.List;

import org.apache.mesos.Protos.Offer;
import org.apache.mesos.Protos.OfferID;
import org.apache.mesos.SchedulerDriver;

import com.google.inject.Singleton;

@Singleton
public class SingularityNoOfferCache implements OfferCache {

  @Override
  public void cacheOffer(SchedulerDriver driver, long timestamp, Offer offer) {
    driver.declineOffer(offer.getId());
  }

  @Override
  public void rescindOffer(SchedulerDriver driver, OfferID offerId) {
    // no-op
  }

  @Override
  public void useOffer(OfferID offerId) {
    // no-op
  }

  @Override
  public List<Offer> getCachedOffers() {
    return Collections.emptyList();
  }

}