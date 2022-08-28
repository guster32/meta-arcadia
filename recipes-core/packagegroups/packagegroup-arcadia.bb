DESCRIPTION = "Arcadia packagegroups"
SUMMARY = "Arcadia packagegroup - for development"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup


PACKAGES = "\
  packagegroup-lldb \
  packagegroup-testapps \
"

RDEPENDS_packagegroup-lldb = "\
  python3 \
  python3-pip \
  python3-six \
  lldb \
  lldb-server"

RDEPENDS_packagegroup-testapps = "kmscube"