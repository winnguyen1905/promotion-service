package com.winnguyen1905.promotion.persistance.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "discount_users")
public class EDiscountUsage extends EBaseAudit {

  @ManyToOne
  @JoinColumn(name = "discount_id")
  private EDiscount discount;

  @Column(name = "user_id")
  private UUID userId;

  @Column(name = "remaining_usage")
  private UUID orderId;

}
