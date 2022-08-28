DESCRIPTION = "Arcadia packagegroups"

inherit packagegroup

PACKAGES = "\
  ${PN}-apps \
  ${PN}-tools"

RDEPENDS:${PN}-apps = " kmscube "

RDEPENDS:${PN}-tools = "\
  python3 \
  python3-pip \
  python3-six \
  lldb \
  lldb-server"
