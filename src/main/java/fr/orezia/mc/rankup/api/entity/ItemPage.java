package fr.orezia.mc.rankup.api.entity;

import org.jetbrains.annotations.NotNull;

public class ItemPage {

  private int stepNumber;
  private @NotNull String rankUpBusinessId;

  public ItemPage(int stepNumber, final @NotNull String rankUpBusinessId) {
    this.stepNumber = stepNumber;
    this.rankUpBusinessId = rankUpBusinessId;
  }

  /**
   * Get the rank-up business ID.
   *
   * @return the rank-up business ID.
   */
  public @NotNull String rankUpBusinessId() {
    return rankUpBusinessId;
  }

  /**
   * Set the rank-up business ID.
   * @param rankUpBusinessId the rank-up business ID.
   * @return this.
   */
  public ItemPage rankUpBusinessId(final @NotNull String rankUpBusinessId) {
    this.rankUpBusinessId = rankUpBusinessId;
    return this;
  }

  public int stepNumber() {
    return stepNumber;
  }

  public @NotNull ItemPage stepNumber(int stepNumber) {
    this.stepNumber = stepNumber;
    return this;
  }
}
