package edu.wpi.first.desktop.plugin;

/**
 * Describes a plugin, including its owner, name, current version, and a summary of what the plugin provides.
 */
public final class Descriptor {

  private final String groupId;
  private final String name;
  private final String versionString;
  private final String summary;

  /**
   * Creates a new descriptor.
   *
   * @param groupId       the group ID of the owner of the plugin. By convention this is in
   *                      reverse domain-name notation e.g. {@code "com.example.my.plugin"}
   * @param name          the name of the plugin
   * @param versionString a version string of the plugin. This must follow
   *                      <a href="https://semver.org/">Semantic versioning guidelines</a>
   * @param summary       a summary of what the plugin provides
   */
  public Descriptor(String groupId, String name, String versionString, String summary) {
    this.groupId = groupId;
    this.name = name;
    this.versionString = versionString;
    this.summary = summary;
  }

  public String getGroupId() {
    return groupId;
  }

  public String getName() {
    return name;
  }

  public String getVersionString() {
    return versionString;
  }

  public String getSummary() {
    return summary;
  }

  public String idString() {
    return groupId + ":" + name;
  }

  public String fullIdString() {
    return groupId + ":" + name + ":" + versionString;
  }

}